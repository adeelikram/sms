import { WebPlugin } from '@capacitor/core';
import { smsPlugin } from './definitions';

export class smsWeb extends WebPlugin implements smsPlugin {
  constructor() {
    super({
      name: 'sms',
      platforms: ['web'],
    });
  }

  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

const sms = new smsWeb();

export { sms };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(sms);
