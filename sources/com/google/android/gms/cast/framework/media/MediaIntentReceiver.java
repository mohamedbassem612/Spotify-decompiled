package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import p.b3e;
import p.b4e;
import p.ca61;
import p.dxh0;
import p.e321;
import p.min1;
import p.pue0;
import p.ren1;
import p.wf61;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final pue0 log = new pue0(TAG, (String) null);

    private static e321 getRemoteMediaClient(b4e b4eVar) {
        if (b4eVar == null || !b4eVar.a()) {
            return null;
        }
        zod.n("Must be called from the main thread.");
        return b4eVar.j;
    }

    private void seek(b4e b4eVar, long j) {
        e321 remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(b4eVar)) == null || remoteMediaClient.h() || remoteMediaClient.k()) {
            return;
        }
        dxh0 dxh0Var = new dxh0(remoteMediaClient.b() + j);
        zod.n("Must be called from the main thread.");
        if (remoteMediaClient.r()) {
            e321.s(new min1(remoteMediaClient, dxh0Var));
        } else {
            e321.q();
        }
    }

    private void togglePlayback(b4e b4eVar) {
        e321 remoteMediaClient = getRemoteMediaClient(b4eVar);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.m();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        log.a("onReceive action: %s", new Object[]{action});
        if (action == null) {
            return;
        }
        b3e b3eVarA = b3e.a(context);
        b3eVarA.getClass();
        zod.n("Must be called from the main thread.");
        wf61 wf61Var = b3eVarA.b;
        ca61 ca61VarC = wf61Var.c();
        if (ca61VarC != null) {
            switch (action.hashCode()) {
                case -1699820260:
                    if (action.equals(ACTION_REWIND)) {
                        onReceiveActionRewind(ca61VarC, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                        return;
                    }
                    break;
                case -945151566:
                    if (action.equals(ACTION_SKIP_NEXT)) {
                        onReceiveActionSkipNext(ca61VarC);
                        return;
                    }
                    break;
                case -945080078:
                    if (action.equals(ACTION_SKIP_PREV)) {
                        onReceiveActionSkipPrev(ca61VarC);
                        return;
                    }
                    break;
                case -668151673:
                    if (action.equals(ACTION_STOP_CASTING)) {
                        wf61Var.b(true);
                        return;
                    }
                    break;
                case -124479363:
                    if (action.equals(ACTION_DISCONNECT)) {
                        wf61Var.b(false);
                        return;
                    }
                    break;
                case 235550565:
                    if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                        onReceiveActionTogglePlayback(ca61VarC);
                        return;
                    }
                    break;
                case 1362116196:
                    if (action.equals(ACTION_FORWARD)) {
                        onReceiveActionForward(ca61VarC, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                        return;
                    }
                    break;
                case 1997055314:
                    if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                        onReceiveActionMediaButton(ca61VarC, intent);
                        return;
                    }
                    break;
            }
            onReceiveOtherAction(context, action, intent);
        }
    }

    public void onReceiveActionForward(ca61 ca61Var, long j) {
        if (ca61Var instanceof b4e) {
            seek((b4e) ca61Var, j);
        }
    }

    public void onReceiveActionMediaButton(ca61 ca61Var, Intent intent) {
        if ((ca61Var instanceof b4e) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            zod.s(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((b4e) ca61Var);
            }
        }
    }

    public void onReceiveActionRewind(ca61 ca61Var, long j) {
        if (ca61Var instanceof b4e) {
            seek((b4e) ca61Var, -j);
        }
    }

    public void onReceiveActionSkipNext(ca61 ca61Var) {
        e321 remoteMediaClient;
        if (!(ca61Var instanceof b4e) || (remoteMediaClient = getRemoteMediaClient((b4e) ca61Var)) == null || remoteMediaClient.k()) {
            return;
        }
        zod.n("Must be called from the main thread.");
        if (remoteMediaClient.r()) {
            e321.s(new ren1(remoteMediaClient, (byte) 1, false));
        } else {
            e321.q();
        }
    }

    public void onReceiveActionSkipPrev(ca61 ca61Var) {
        e321 remoteMediaClient;
        if (!(ca61Var instanceof b4e) || (remoteMediaClient = getRemoteMediaClient((b4e) ca61Var)) == null || remoteMediaClient.k()) {
            return;
        }
        zod.n("Must be called from the main thread.");
        if (remoteMediaClient.r()) {
            e321.s(new ren1(remoteMediaClient, (byte) 0, false));
        } else {
            e321.q();
        }
    }

    public void onReceiveActionTogglePlayback(ca61 ca61Var) {
        if (ca61Var instanceof b4e) {
            togglePlayback((b4e) ca61Var);
        }
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }
}
