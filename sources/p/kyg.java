package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class kyg extends tv30 implements vu30 {
    public static final kyg a = new kyg(2, lyg.class, "mapCollaboratorCardState", "mapCollaboratorCardState(Lcom/spotify/songdna/contributorsheet/CollaboratorCardElement$Props;Lcom/spotify/kodiak/dataloader/DataResult;)Lcom/spotify/songdna/contributorsheet/CollaboratorCardElement$State;", 1);

    public final Object invoke(Object obj, Object obj2) {
        String str;
        xkk1 xkk1Var;
        mq70 mq70Var;
        pp70 pp70Var;
        xkk1 xkk1Var2;
        mq70 mq70Var2;
        up70 up70VarA;
        eyg eygVar = (eyg) obj;
        i1r i1rVar = (k1r) obj2;
        if (i1rVar instanceof j1r) {
            return gyg.a;
        }
        if (!(i1rVar instanceof h1r)) {
            u7h u7hVar = null;
            if (!(i1rVar instanceof i1r)) {
                eg.o();
                return null;
            }
            dyg dygVar = (dyg) i1rVar.a;
            jo70 jo70Var = dygVar.a;
            i1r i1rVar2 = dygVar.b;
            if (jo70Var != null && (str = jo70Var.a) != null) {
                String str2 = !ihc1.y0(str) ? str : null;
                if (str2 != null) {
                    String str3 = eygVar.a;
                    String str4 = eygVar.b;
                    int i = eygVar.c;
                    boolean z = i1rVar2 instanceof i1r;
                    i1r i1rVar3 = z ? i1rVar2 : null;
                    String str5 = (i1rVar3 == null || (xkk1Var2 = (xkk1) i1rVar3.a) == null || (mq70Var2 = xkk1Var2.a) == null || (up70VarA = mq70Var2.a(vp70.c)) == null) ? null : up70VarA.a.a;
                    boolean z2 = !(i1rVar2 instanceof j1r);
                    i1r i1rVar4 = z ? i1rVar2 : null;
                    if (i1rVar4 != null && (xkk1Var = (xkk1) i1rVar4.a) != null && (mq70Var = xkk1Var.a) != null && (pp70Var = mq70Var.b) != null) {
                        u7hVar = new u7h(pp70Var.c.a.b.a());
                    }
                    return new fyg(str3, str4, str2, i, str5, z2, u7hVar);
                }
            }
        }
        return hyg.a;
    }
}
