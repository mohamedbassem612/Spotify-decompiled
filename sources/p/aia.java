package p;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aia extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public aia(yfl1 yfl1Var, nrd nrdVar) {
        this.a = (byte) 3;
        this.b = yfl1Var;
        this.c = nrdVar;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:65:0x012b  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b = this.a;
        boolean z = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                int intExtra = intent.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                ((bia) obj2).b.onNext(Boolean.valueOf(z));
                ((uha) obj).a.onNext(Boolean.valueOf(z));
                break;
            case 1:
                ObservableEmitter observableEmitter = (ObservableEmitter) obj;
                jfb jfbVar = (jfb) obj2;
                ArrayList arrayList = jfbVar.b;
                Bundle extras = intent.getExtras();
                Parcelable parcelable = extras != null ? extras.getParcelable("android.bluetooth.device.extra.DEVICE") : null;
                pfb pfbVarD = parcelable != null ? w081.d(parcelable) : null;
                if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    if (pfbVarD != null) {
                        int i = extras != null ? extras.getInt("android.bluetooth.profile.extra.STATE", -1) : -1;
                        if (extras != null) {
                            extras.getInt("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                        }
                        if (i == 0) {
                            if (arrayList.remove(pfbVarD)) {
                                observableEmitter.onNext(new gfb(false, pfbVarD));
                            }
                            if (arrayList.isEmpty()) {
                                observableEmitter.onNext(new gfb(false, (pfb) null));
                            } else {
                                observableEmitter.onNext(new gfb(true, (pfb) l1d.i(1, arrayList)));
                            }
                        } else if (i != 2) {
                            if (i == 3) {
                                if (arrayList.remove(pfbVarD)) {
                                    observableEmitter.onNext(new gfb(false, pfbVarD));
                                }
                                if (arrayList.isEmpty()) {
                                    observableEmitter.onNext(new gfb(true, (pfb) l1d.i(1, arrayList)));
                                } else {
                                    observableEmitter.onNext(new gfb(false, (pfb) null));
                                }
                            }
                        } else if (!arrayList.contains(pfbVarD)) {
                            arrayList.add(pfbVarD);
                            observableEmitter.onNext(new gfb(true, pfbVarD));
                        }
                    } else {
                        Logger.d("No device available from connection state intent", new Object[0]);
                    }
                } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                    if (pfbVarD != null) {
                        String str = pfbVarD.a;
                    }
                    int i2 = extras != null ? extras.getInt("android.bluetooth.adapter.extra.STATE", -1) : -1;
                    if (extras != null) {
                        extras.getInt("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
                    }
                    if (i2 == 10 || i2 == 13) {
                        arrayList.clear();
                        observableEmitter.onNext(new gfb(false, (pfb) null));
                    }
                } else if (!"android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED".equals(intent.getAction())) {
                    n57.e("Unexpected intent");
                } else if (pfbVarD != null) {
                    int i3 = extras != null ? extras.getInt("android.bluetooth.profile.extra.STATE", -1) : -1;
                    if (extras != null) {
                        extras.getInt("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    }
                    if (i3 == 10) {
                        if (!arrayList.contains(pfbVarD)) {
                            arrayList.add(pfbVarD);
                        }
                        observableEmitter.onNext(new gfb(true, pfbVarD));
                    }
                } else {
                    Logger.d("No device available from connection state intent", new Object[0]);
                }
                if (!jfbVar.c) {
                    jfbVar.c = true;
                }
                break;
            case 2:
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_ON".equals(action) || "android.intent.action.SCREEN_OFF".equals(action)) {
                    ((bqb1) ((tp7) obj).c).a(3, String.valueOf(((KeyguardManager) obj2).isKeyguardLocked()));
                }
                break;
            default:
                yfl1 yfl1Var = (yfl1) obj2;
                String action2 = intent.getAction();
                if (action2 != null) {
                    int iHashCode = action2.hashCode();
                    if (iHashCode != -2062487035) {
                        if (iHashCode != -629196449) {
                            if (iHashCode == -377338156 && action2.equals("com.spotify.music.internal.waze.STOP")) {
                                yfl1Var.a();
                            }
                        } else if (action2.equals("com.spotify.music.internal.waze.WAKE_BY_MBS") && !yfl1Var.c()) {
                            alg1 alg1Var = yfl1Var.c;
                            yfl1Var.h = alg1Var;
                            alg1Var.i(yfl1Var.j);
                        }
                    } else if (action2.equals("com.spotify.music.internal.waze.LAUNCH")) {
                        if (yfl1Var.c()) {
                            yfl1Var.h.a();
                        } else {
                            yfl1Var.i.b(Single.create(new bx5(yfl1Var.a)).observeOn(yfl1Var.b).subscribe(new rdj1(yfl1Var, (byte) 15)));
                        }
                    }
                }
                ((HashMap) ((nrd) obj).a.d).remove(intent.getAction());
                break;
        }
    }

    public /* synthetic */ aia(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
