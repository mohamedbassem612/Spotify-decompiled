package p;

import com.google.common.collect.a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class q380 extends q280 implements Collection {
    public static final /* synthetic */ int d = 0;
    public transient bg11 b;
    public transient t380 c;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final b380 b() {
        bg11 bg11Var = this.b;
        if (bg11Var != null) {
            return bg11Var;
        }
        bg11 bg11VarB = super.b();
        this.b = bg11VarB;
        return bg11VarB;
    }

    public final int c(int i, Object[] objArr) {
        mjh1 mjh1VarK = m().k();
        while (mjh1VarK.hasNext()) {
            ffp0 ffp0Var = (ffp0) mjh1VarK.next();
            Arrays.fill(objArr, i, ffp0Var.a() + i, ffp0Var.a);
            i += ffp0Var.a();
        }
        return i;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q380)) {
            return false;
        }
        q380 q380Var = (q380) obj;
        jg11 jg11Var = (jg11) this;
        if (jg11Var.f != q380Var.size() || m().size() != q380Var.m().size()) {
            return false;
        }
        for (ffp0 ffp0Var : q380Var.m()) {
            if (jg11Var.e.b(ffp0Var.a) != ffp0Var.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return zqo1.q(m());
    }

    @Override // java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final mjh1 iterator() {
        return new n380(m().k());
    }

    public abstract t380 l();

    /* JADX WARN: Multi-variable type inference failed */
    public final t380 m() {
        kg11 aVar = this.c;
        if (aVar == null) {
            aVar = isEmpty() ? kg11.t : new a(this);
            this.c = aVar;
        }
        return aVar;
    }

    public final String toString() {
        return m().toString();
    }

    public abstract Object writeReplace();
}
