package p;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pb11 extends ub11 implements p8a0 {
    public final Constructor a;

    public pb11(Constructor constructor) {
        this.a = constructor;
    }

    @Override // p.ub11
    public final Member b() {
        return this.a;
    }

    public final Constructor f() {
        return this.a;
    }

    @Override // p.p8a0
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ac11(typeVariable));
        }
        return arrayList;
    }
}
