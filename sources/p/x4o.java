package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x4o implements tyq {
    public final af10 a;
    public final lzn0 b;
    public final d5o c;
    public final eyh0 d;
    public final d0r e;
    public final i13 f = new i13(this, (byte) 26);
    public final c5o g = new c5o((byte) 0);
    public final js20 h = x3p1.n(new w4o(this, (byte) 0), h4o.i, new z6n(2, this, x4o.class, "mapToState", "mapToState(Lcom/spotify/creativeworkplatform/creatorsrowelement/CreatorsRowProps;Lcom/spotify/creativeworkplatform/creatorsrowelement/CreatorsRowDataElement$ExternalState;)Lcom/spotify/creativeworkplatform/creatorsrowelement/CreatorsRowState;", 0, (byte) 14), (o8n) null, new w4o(this, (byte) 1), 8);
    public final psw i;

    public x4o(af10 af10Var, lzn0 lzn0Var, d5o d5oVar, eyh0 eyh0Var, d0r d0rVar) {
        this.a = af10Var;
        this.b = lzn0Var;
        this.c = d5oVar;
        this.d = eyh0Var;
        this.e = d0rVar;
        j2i j2iVar = new j2i(287356355, new bfm(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public static o3r f(List list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (String str : list2) {
            arrayList.add(new l4r(new xv00(rc11.a.b(xkk1.class)), 2, h4o.g, new j4r(new i3o(str, (byte) 2)), h4o.h));
        }
        return new o3r(arrayList, new s6(list, (byte) 21), false);
    }

    public static List g(f5o f5oVar) {
        ArrayList<e5o> arrayList = f5oVar.b;
        ArrayList arrayList2 = new ArrayList();
        for (e5o e5oVar : arrayList) {
            r7h.W(f46.i0(new String[]{e5oVar.c, e5oVar.b}), arrayList2);
        }
        return o7h.j0(arrayList2);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.i;
    }

    public final d0r e() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.h;
    }

    public final f4r getData() {
        return this.f;
    }
}
