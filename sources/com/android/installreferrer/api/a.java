package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import p.jah;
import p.wg70;
import p.xg70;
import p.yg70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a implements ServiceConnection {
    public final InstallReferrerStateListener a;
    public final /* synthetic */ b b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.b = bVar;
        if (installReferrerStateListener != null) {
            this.a = installReferrerStateListener;
        } else {
            jah.g("Please specify a listener to know when setup is done.");
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yg70 wg70Var;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = xg70.a;
        if (iBinder == null) {
            wg70Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            wg70Var = iInterfaceQueryLocalInterface instanceof yg70 ? (yg70) iInterfaceQueryLocalInterface : new wg70(iBinder);
        }
        b bVar = this.b;
        bVar.c = wg70Var;
        bVar.a = (byte) 2;
        this.a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.b;
        bVar.c = null;
        bVar.a = (byte) 0;
        this.a.onInstallReferrerServiceDisconnected();
    }
}
