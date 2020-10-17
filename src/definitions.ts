declare module '@capacitor/core' {
  interface PluginRegistry {
    sms: smsPlugin;
  }
}

export interface smsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
