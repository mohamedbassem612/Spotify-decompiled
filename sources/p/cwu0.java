package p;

import com.spotify.musicplaybackspeed.speedcontrol.PlaylistSpeedChangesError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cwu0 {
    public final iyc0 a;

    public cwu0(iyc0 iyc0Var) {
        this.a = iyc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, dwu0 dwu0Var, onm onmVar) {
        bwu0 bwu0Var;
        String str2;
        e331 e331Var;
        if (onmVar instanceof bwu0) {
            bwu0Var = (bwu0) onmVar;
            int i = bwu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bwu0Var.c = i - Integer.MIN_VALUE;
            } else {
                bwu0Var = new bwu0(this, onmVar);
            }
        } else {
            bwu0Var = new bwu0(this, onmVar);
        }
        Object objA = bwu0Var.a;
        int i2 = bwu0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            int iOrdinal = dwu0Var.ordinal();
            if (iOrdinal == 0) {
                str2 = "speed-remove-opt-out";
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                str2 = "speed-opt-out";
            }
            ayc0 ayc0Var = new ayc0(str2, (phc) null, (phc) null, false, (String) null, 30);
            bwu0Var.c = 1;
            objA = iyc0.a(this.a, str, ayc0Var, bwu0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        ly21 ly21Var = (py21) objA;
        ly21Var.getClass();
        if (ly21Var instanceof ly21) {
            e331Var = new e331(new m231(new PlaylistSpeedChangesError.SignalFailed(ly21Var.a.b())));
        } else {
            if (!(ly21Var instanceof oy21)) {
                eg.o();
                return null;
            }
            e331Var = new e331(rih1.a);
        }
        return e331Var.a;
    }
}
