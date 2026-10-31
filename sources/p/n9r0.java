package p;

import android.content.Context;
import com.google.protobuf.Duration;
import com.spotify.collection2.itemdata.proto.CollectionItemdata;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItem;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n9r0 {
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;
    public static final bma1 i;
    public final Context a;
    public final ucd b;
    public final w4h c;
    public final yqg d;
    public final m9r0 e;

    static {
        nbc nbcVar = bma1.b;
        f = nbcVar.u("page-match-onboarding");
        g = nbcVar.u("page-match-outbound-flow-completed");
        h = nbcVar.u("page-match-gradient-event-number");
        i = nbcVar.u("page-match-gradient-tap-timestamp");
    }

    public n9r0(Context context, mr20 mr20Var, ucd ucdVar, w4h w4hVar, yqg yqgVar) {
        this.a = context;
        this.b = ucdVar;
        this.c = w4hVar;
        this.d = yqgVar;
        this.e = new m9r0(mr20Var, this, (byte) 0);
    }

    public final Object a(long j, String str, onm onmVar) {
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.t(w5h.g);
        t4h t4hVarQ = CollectionPlatformItem.q();
        t4hVarQ.q(str);
        h4h h4hVarT = CollectionItemdata.ItemData.t();
        i4h i4hVarP = CollectionItemdata.PageMatchItemData.p();
        ifv ifvVarQ = Duration.q();
        ifvVarQ.q(j);
        i4hVarP.n(ifvVarQ);
        h4hVarT.n(i4hVarP);
        t4hVarQ.n(h4hVarT);
        u4hVarQ.q(t4hVarQ);
        Object objI = fc11.i(this.c.a(u4hVarQ.build()).ignoreElement(), onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        i9r0 i9r0Var;
        if (onmVar instanceof i9r0) {
            i9r0Var = (i9r0) onmVar;
            int i2 = i9r0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i9r0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                i9r0Var = new i9r0(this, onmVar);
            }
        } else {
            i9r0Var = new i9r0(this, onmVar);
        }
        Object objK = i9r0Var.a;
        int i3 = i9r0Var.c;
        if (i3 == 0) {
            hm5.M(objK);
            i9r0Var.c = 1;
            objK = b5p1.k(this.e, i9r0Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        dma1 dma1Var = (dma1) objK;
        if (dma1Var != null) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.a(g, true);
            hma1VarEdit.g();
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        j9r0 j9r0Var;
        if (onmVar instanceof j9r0) {
            j9r0Var = (j9r0) onmVar;
            int i2 = j9r0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j9r0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                j9r0Var = new j9r0(this, onmVar);
            }
        } else {
            j9r0Var = new j9r0(this, onmVar);
        }
        Object objK = j9r0Var.a;
        int i3 = j9r0Var.c;
        if (i3 == 0) {
            hm5.M(objK);
            j9r0Var.c = 1;
            objK = b5p1.k(this.e, j9r0Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        dma1 dma1Var = (dma1) objK;
        if (dma1Var != null) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.a(f, true);
            hma1VarEdit.g();
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(int i2, onm onmVar) {
        k9r0 k9r0Var;
        if (onmVar instanceof k9r0) {
            k9r0Var = (k9r0) onmVar;
            int i3 = k9r0Var.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k9r0Var.d = i3 - Integer.MIN_VALUE;
            } else {
                k9r0Var = new k9r0(this, onmVar);
            }
        } else {
            k9r0Var = new k9r0(this, onmVar);
        }
        Object objK = k9r0Var.b;
        int i4 = k9r0Var.d;
        if (i4 == 0) {
            hm5.M(objK);
            k9r0Var.a = i2;
            k9r0Var.d = 1;
            objK = b5p1.k(this.e, k9r0Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = k9r0Var.a;
            hm5.M(objK);
        }
        dma1 dma1Var = (dma1) objK;
        rih1 rih1Var = rih1.a;
        if (dma1Var != null) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.c(i, this.d.b());
            if (i2 > 0) {
                hma1VarEdit.b(h, i2);
            }
            hma1VarEdit.g();
        }
        return rih1Var;
    }
}
