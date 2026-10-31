package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f9u implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h9u b;

    public /* synthetic */ f9u(h9u h9uVar, byte b) {
        this.a = b;
        this.b = h9uVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        h9u h9uVar = this.b;
        switch (b) {
            case 0:
                e8u e8uVar = (e8u) obj;
                if (e8uVar.a) {
                    q9l1 q9l1Var = h9uVar.r;
                    bcl1 bcl1Var = h9uVar.l;
                    o0i o0iVar = (o0i) q9l1Var.c.getValue();
                    hp80 hp80Var = o0iVar != null ? o0iVar.e : null;
                    boolean z = e8uVar.b;
                    m0t m0tVar = h9uVar.i;
                    if (!z) {
                        m0tVar.b();
                        bcl1Var.e(hp80Var, new e9u(hp80Var, (byte) 1));
                    } else {
                        m0t.a(m0tVar, 6);
                        bcl1Var.e(hp80Var, new e9u(hp80Var, (byte) 0));
                    }
                }
                break;
            case 1:
                kji1 kji1Var = h9uVar.m;
                if (kji1Var.b.e() != u75.b && !kji1Var.d) {
                    kji1Var.a.P();
                    kji1Var.d = true;
                    break;
                }
                break;
            case 2:
                h9uVar.k.a(((b9u) obj).a);
                break;
            case 3:
                vi11 vi11Var = h9uVar.f;
                ((q8u) obj).getClass();
                String strA = bbu.a(h9uVar.g);
                if (strA == null) {
                    hhg1.n("Required value was null.");
                    break;
                } else {
                    dma1 dma1Var = (dma1) vi11Var.b;
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.a(bma1.b.n("watch_feed_first_time_user_".concat(strA)), false);
                    hma1VarEdit.g();
                    int iOrdinal = ((v75) vi11Var.c).e().ordinal();
                    if (iOrdinal == 1) {
                        vi11Var.P();
                        break;
                    } else if (iOrdinal == 2) {
                        hma1 hma1VarEdit2 = dma1Var.edit();
                        hma1VarEdit2.a((bma1) vi11Var.e, true);
                        hma1VarEdit2.g();
                        vi11Var.P();
                        break;
                    }
                }
                break;
            case 4:
                a9u a9uVar = (a9u) obj;
                q9l1 q9l1Var2 = h9uVar.q;
                String str = a9uVar.a;
                q9l1Var2.getClass();
                q9l1Var2.e = a9uVar.b;
                q9l1Var2.m = a9uVar.c;
                q9l1Var2.l = a9uVar.d;
                break;
            case 5:
                ((c9u) obj).getClass();
                h9uVar.i.b();
                break;
            default:
                v8u v8uVar = (v8u) obj;
                h9uVar.k.a(!v8uVar.b);
                bcl1 bcl1Var2 = h9uVar.l;
                o0i o0iVar2 = (o0i) h9uVar.r.c.getValue();
                bcl1Var2.e(o0iVar2 != null ? o0iVar2.e : null, new nit(v8uVar, (byte) 7));
                break;
        }
    }
}
