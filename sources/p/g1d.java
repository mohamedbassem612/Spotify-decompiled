package p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class g1d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p1d b;
    public final /* synthetic */ String c;
    public final /* synthetic */ bb61 d;
    public final /* synthetic */ i4i1 e;
    public final /* synthetic */ i29 f;
    public final /* synthetic */ List g;

    public /* synthetic */ g1d(p1d p1dVar, String str, bb61 bb61Var, i4i1 i4i1Var, i29 i29Var, List list, byte b) {
        this.a = b;
        this.b = p1dVar;
        this.c = str;
        this.d = bb61Var;
        this.e = i4i1Var;
        this.f = i29Var;
        this.g = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p1d p1dVar = this.b;
                String str = this.c;
                bb61 bb61Var = this.d;
                i4i1 i4i1Var = this.e;
                i29 i29Var = this.f;
                List list = this.g;
                p1dVar.t("Use case " + str + " RESET");
                p1dVar.a.u(str, bb61Var, i4i1Var, i29Var, list);
                p1dVar.p();
                p1dVar.D();
                p1dVar.K();
                if (p1dVar.h1 == 9) {
                    p1dVar.B();
                }
                break;
            case 1:
                p1d p1dVar2 = this.b;
                String str2 = this.c;
                bb61 bb61Var2 = this.d;
                i4i1 i4i1Var2 = this.e;
                i29 i29Var2 = this.f;
                List list2 = this.g;
                p1dVar2.t("Use case " + str2 + " UPDATED");
                p1dVar2.a.u(str2, bb61Var2, i4i1Var2, i29Var2, list2);
                p1dVar2.K();
                break;
            default:
                p1d p1dVar3 = this.b;
                String str3 = this.c;
                bb61 bb61Var3 = this.d;
                i4i1 i4i1Var3 = this.e;
                i29 i29Var3 = this.f;
                List list3 = this.g;
                p1dVar3.t("Use case " + str3 + " ACTIVE");
                LinkedHashMap linkedHashMap = (LinkedHashMap) p1dVar3.a.b;
                g4i1 g4i1Var = (g4i1) linkedHashMap.get(str3);
                if (g4i1Var == null) {
                    g4i1Var = new g4i1(bb61Var3, i4i1Var3, i29Var3, list3);
                    linkedHashMap.put(str3, g4i1Var);
                }
                g4i1Var.f = true;
                p1dVar3.a.u(str3, bb61Var3, i4i1Var3, i29Var3, list3);
                p1dVar3.K();
                break;
        }
    }
}
