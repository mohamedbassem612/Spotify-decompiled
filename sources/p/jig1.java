package p;

import com.spotify.playlistmixing.proto.SetTransition;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jig1 {
    public final iyc0 a;

    public jig1(iyc0 iyc0Var) {
        this.a = iyc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, String str2, phc phcVar, iu30 iu30Var, onm onmVar) {
        eig1 eig1Var;
        if (onmVar instanceof eig1) {
            eig1Var = (eig1) onmVar;
            int i = eig1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eig1Var.d = i - Integer.MIN_VALUE;
            } else {
                eig1Var = new eig1(this, onmVar);
            }
        } else {
            eig1Var = new eig1(this, onmVar);
        }
        eig1 eig1Var2 = eig1Var;
        Object objT = eig1Var2.b;
        int i2 = eig1Var2.d;
        if (i2 == 0) {
            hm5.M(objT);
            eig1Var2.a = iu30Var;
            eig1Var2.d = 1;
            objT = this.a.t(str, str2, "set-transition", phcVar, eig1Var2);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iu30Var = eig1Var2.a;
            hm5.M(objT);
        }
        ly21 ly21Var = (py21) objT;
        return ly21Var instanceof oy21 ? rih1.a : new m231((Throwable) iu30Var.invoke(ly21Var.a.b()));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(String str, String str2, onm onmVar) {
        fig1 fig1Var;
        if (onmVar instanceof fig1) {
            fig1Var = (fig1) onmVar;
            int i = fig1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fig1Var.c = i - Integer.MIN_VALUE;
            } else {
                fig1Var = new fig1(this, onmVar);
            }
        } else {
            fig1Var = new fig1(this, onmVar);
        }
        fig1 fig1Var2 = fig1Var;
        Object obj = fig1Var2.a;
        int i2 = fig1Var2.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        fig1Var2.c = 1;
        Object objA = a(str, str2, null, gig1.a, fig1Var2);
        Object obj2 = d9n.a;
        return objA == obj2 ? obj2 : objA;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(String str, String str2, String str3, String str4, onm onmVar) {
        hig1 hig1Var;
        if (onmVar instanceof hig1) {
            hig1Var = (hig1) onmVar;
            int i = hig1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hig1Var.c = i - Integer.MIN_VALUE;
            } else {
                hig1Var = new hig1(this, onmVar);
            }
        } else {
            hig1Var = new hig1(this, onmVar);
        }
        hig1 hig1Var2 = hig1Var;
        Object obj = hig1Var2.a;
        int i2 = hig1Var2.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        wl61 wl61VarN = SetTransition.n();
        wl61VarN.r(str3);
        wl61VarN.s(str4);
        wl61VarN.q();
        phc byteString = ((SetTransition) wl61VarN.build()).toByteString();
        hig1Var2.c = 1;
        Object objA = a(str, str2, byteString, iig1.a, hig1Var2);
        Object obj2 = d9n.a;
        return objA == obj2 ? obj2 : objA;
    }
}
