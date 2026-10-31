package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x3r extends hab0 implements iu30 {
    public final /* synthetic */ gv30 a;
    public final /* synthetic */ l4r b;
    public final /* synthetic */ l4r c;
    public final /* synthetic */ l4r d;
    public final /* synthetic */ l4r e;
    public final /* synthetic */ l4r f;
    public final /* synthetic */ l4r g;
    public final /* synthetic */ l4r h;
    public final /* synthetic */ l4r i;
    public final /* synthetic */ l4r t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3r(l4r l4rVar, l4r l4rVar2, l4r l4rVar3, l4r l4rVar4, l4r l4rVar5, l4r l4rVar6, l4r l4rVar7, l4r l4rVar8, l4r l4rVar9, gv30 gv30Var) {
        super(1);
        this.a = gv30Var;
        this.b = l4rVar;
        this.c = l4rVar2;
        this.d = l4rVar3;
        this.e = l4rVar4;
        this.f = l4rVar5;
        this.g = l4rVar6;
        this.h = l4rVar7;
        this.i = l4rVar8;
        this.t = l4rVar9;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        List list = (List) obj;
        return this.a.b1(this.b.e.invoke(list.get(0)), this.c.e.invoke(list.get(1)), this.d.e.invoke(list.get(2)), this.e.e.invoke(list.get(3)), this.f.e.invoke(list.get(4)), this.g.e.invoke(list.get(5)), this.h.e.invoke(list.get(6)), this.i.e.invoke(list.get(7)), this.t.e.invoke(list.get(8)));
    }
}
