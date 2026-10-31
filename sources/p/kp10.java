package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class kp10 extends tv30 implements vu30 {
    public static final kp10 a = new kp10(2, mp10.class, "mapToState", "mapToState(Lcom/spotify/listeningactivity/elements/feedactivitylistrow/api/FeedActivityListRowElement$Props;Lcom/spotify/listeningactivity/elements/feedactivitylistrow/impl/ExternalState;)Lcom/spotify/listeningactivity/elements/feedactivitylistrow/api/FeedActivityListRowElement$State;", 1);

    public final Object invoke(Object obj, Object obj2) {
        String str;
        fp10 fp10Var = (fp10) obj;
        ha10 ha10Var = (ha10) obj2;
        ap10 ap10Var = fp10Var.b;
        tnj0 tnj0Var = ha10Var.a;
        i1r i1rVar = tnj0Var.b;
        i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
        if (i1rVar2 == null) {
            return new hp10(fp10Var.a, ap10Var.a, ap10Var.c);
        }
        i1r i1rVar3 = tnj0Var.a;
        i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
        i1e i1eVar = i1rVar4 != null ? (i1e) i1rVar4.a : null;
        String str2 = fp10Var.a;
        String str3 = (i1eVar == null || (str = i1eVar.a) == null) ? str2 : str;
        String str4 = i1eVar != null ? i1eVar.b : null;
        String str5 = str4 == null ? "" : str4;
        Integer num = i1eVar != null ? i1eVar.c : null;
        v0e v0eVar = (v0e) i1rVar2.a;
        String str6 = v0eVar.a;
        String str7 = v0eVar.c;
        String str8 = v0eVar.b;
        return new gp10(str2, str3, str5, num, str6, str7, str8 == null ? "" : str8, ap10Var.c, ha10Var.b, ha10Var.c);
    }
}
