package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m1e0 implements vr20 {
    public final /* synthetic */ vr20 a;
    public final /* synthetic */ zad0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ gad0 d;
    public final /* synthetic */ long e;

    public m1e0(vr20 vr20Var, zad0 zad0Var, String str, gad0 gad0Var, long j) {
        this.a = vr20Var;
        this.b = zad0Var;
        this.c = str;
        this.d = gad0Var;
        this.e = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object emit(Object obj, lnm lnmVar) {
        l1e0 l1e0Var;
        if (lnmVar instanceof l1e0) {
            l1e0Var = (l1e0) lnmVar;
            int i = l1e0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                l1e0Var.b = i - Integer.MIN_VALUE;
            } else {
                l1e0Var = new l1e0(this, lnmVar);
            }
        } else {
            l1e0Var = new l1e0(this, lnmVar);
        }
        Object obj2 = l1e0Var.a;
        int i2 = l1e0Var.b;
        wad0 wad0Var = null;
        if (i2 == 0) {
            hm5.M(obj2);
            mmr0 mmr0Var = (mmr0) obj;
            String str = (String) mmr0Var.a;
            String str2 = (String) mmr0Var.b;
            String str3 = this.b.a;
            if (str != null && str2 != null) {
                wad0Var = new wad0(str, str2);
            }
            gad0 gad0Var = this.d;
            String str4 = gad0Var.a;
            String str5 = gad0Var.b;
            long j = this.e;
            oad0 oad0Var = new oad0(str3, this.c, wad0Var, str4, str5, j);
            l1e0Var.b = 1;
            Object objEmit = this.a.emit(oad0Var, l1e0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
