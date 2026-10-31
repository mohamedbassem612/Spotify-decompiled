package p;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vw21 implements wrw {
    public final iu30 a;
    public final Map b;
    public final vu30 c;
    public final vu30 d;
    public final vu30 e;

    public vw21(iu30 iu30Var, Map map, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3) {
        this.a = iu30Var;
        this.b = map;
        this.c = vu30Var;
        this.d = vu30Var2;
        this.e = vu30Var3;
    }

    @Override // p.wrw
    public final f4r b() {
        Map map = this.b;
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            Set set = (Set) map.get(obj);
            ip7 ip7Var = (set == null || !set.isEmpty()) ? new ip7(this, obj, (byte) 2) : null;
            if (ip7Var != null) {
                arrayList.add(ip7Var);
            }
        }
        return i6p1.h(arrayList);
    }

    @Override // p.wrw
    public final vu30 c() {
        return this.c;
    }

    @Override // p.wrw
    public final vu30 d() {
        return this.d;
    }

    @Override // p.wrw
    public final iu30 e() {
        return this.a;
    }

    @Override // p.wrw
    public final s3r f() {
        return new uw21(this);
    }

    @Override // p.wrw
    public final ruh0 g() {
        return new e7x();
    }

    @Override // p.wrw
    public final Map getMetadata() {
        return this.b;
    }

    @Override // p.wrw
    public final vu30 h() {
        return this.e;
    }
}
