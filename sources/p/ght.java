package p;

import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ght extends mgo1 {
    public final /* synthetic */ siz c;
    public final /* synthetic */ LinkedHashSet d;
    public final /* synthetic */ boolean e;

    public ght(siz sizVar, LinkedHashSet linkedHashSet, boolean z) {
        this.c = sizVar;
        this.d = linkedHashSet;
        this.e = z;
    }

    public static /* synthetic */ void z(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final void k(jyc jycVar) {
        if (jycVar == null) {
            z(0);
            throw null;
        }
        exq0.r(jycVar, new p5(this, (byte) 20));
        this.d.add(jycVar);
    }

    public final void x(jyc jycVar, Collection collection) {
        if (jycVar == null) {
            z(3);
            throw null;
        }
        if (!this.e || jycVar.getKind() == 2) {
            jycVar.k0(collection);
        }
    }
}
