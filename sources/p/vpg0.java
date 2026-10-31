package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vpg0 implements zob1 {
    public final /* synthetic */ byte a;
    public final zob1 b;

    public /* synthetic */ vpg0(zob1 zob1Var, byte b) {
        this.a = b;
        this.b = zob1Var;
    }

    public final List c() {
        byte b = this.a;
        xe01 xe01Var = this.b;
        switch (b) {
            case 0:
                bp90 bp90Var = (bp90) xe01Var.getValue();
                return Collections.singletonList(Boolean.valueOf(bp90Var.b && bp90Var.a));
            default:
                v0z0 v0z0Var = (v0z0) xe01Var.a.getValue();
                return Collections.singletonList(v0z0Var != null ? new qwc(v0z0Var.a, v0z0Var.b) : null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        upg0 upg0Var;
        xpg0 xpg0Var;
        byte b = this.a;
        xe01 xe01Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof upg0) {
                    upg0Var = (upg0) lnmVar;
                    int i = upg0Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        upg0Var.c = i - Integer.MIN_VALUE;
                    } else {
                        upg0Var = new upg0(this, lnmVar);
                    }
                } else {
                    upg0Var = new upg0(this, lnmVar);
                }
                Object obj = upg0Var.a;
                int i2 = upg0Var.c;
                if (i2 != 0) {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                oq0 oq0Var = new oq0(vr20Var, this, (byte) 19);
                upg0Var.c = 1;
                if (xe01Var.collect(oq0Var, upg0Var) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
            default:
                if (lnmVar instanceof xpg0) {
                    xpg0Var = (xpg0) lnmVar;
                    int i3 = xpg0Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xpg0Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        xpg0Var = new xpg0(this, lnmVar);
                    }
                } else {
                    xpg0Var = new xpg0(this, lnmVar);
                }
                Object obj2 = xpg0Var.a;
                int i4 = xpg0Var.c;
                if (i4 != 0) {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj2);
                    }
                    return null;
                }
                hm5.M(obj2);
                oq0 oq0Var2 = new oq0(vr20Var, this, (byte) 20);
                xpg0Var.c = 1;
                if (xe01Var.a.collect(oq0Var2, xpg0Var) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
        }
    }

    public final Object getValue() {
        byte b = this.a;
        xe01 xe01Var = this.b;
        switch (b) {
            case 0:
                bp90 bp90Var = (bp90) xe01Var.getValue();
                return Boolean.valueOf(bp90Var.b && bp90Var.a);
            default:
                v0z0 v0z0Var = (v0z0) xe01Var.a.getValue();
                if (v0z0Var != null) {
                    return new qwc(v0z0Var.a, v0z0Var.b);
                }
                return null;
        }
    }
}
