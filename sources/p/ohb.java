package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ohb extends BroadcastReceiver {
    public final /* synthetic */ ayh a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ dt71 c;
    public final /* synthetic */ ayh d;

    public ohb(ayh ayhVar, AtomicBoolean atomicBoolean, dt71 dt71Var, ayh ayhVar2) {
        this.a = ayhVar;
        this.b = atomicBoolean;
        this.c = dt71Var;
        this.d = ayhVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)) : null;
        rih1 rih1Var = rih1.a;
        ayh ayhVar = this.a;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            ayhVar.m0(rih1Var);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == -1) {
            if (ayhVar.v()) {
                return;
            }
            ayhVar.y0(new IllegalStateException("Bluetooth SCO connection failed"));
        } else if (numValueOf != null && numValueOf.intValue() == 0 && ayhVar.v()) {
            if (!this.b.get()) {
                this.c.a(rih1Var);
            }
            this.d.m0(rih1Var);
        }
    }
}
