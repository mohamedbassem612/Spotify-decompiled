package p;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class e380 extends yaa implements Serializable {
    public final transient gg11 e;
    public final transient int f;

    public e380(gg11 gg11Var, int i) {
        this.e = gg11Var;
        this.f = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(f4i1.c(i, "Invalid key count "));
        }
        h380 h380VarA = j380.a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(f4i1.c(i4, "Invalid value count "));
            }
            v280 v280VarM = b380.m();
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                v280VarM.c(object2);
            }
            h380VarA.e(object, v280VarM.g());
            i2 += i4;
        }
        try {
            gg11 gg11VarB = h380VarA.b(true);
            s6z0 s6z0Var = m380.a;
            s6z0Var.getClass();
            try {
                ((Field) s6z0Var.b).set(this, gg11VarB);
                s6z0 s6z0Var2 = m380.b;
                s6z0Var2.getClass();
                try {
                    ((Field) s6z0Var2.b).set(this, Integer.valueOf(i2));
                } catch (IllegalAccessException e) {
                    eg.f(e);
                }
            } catch (IllegalAccessException e2) {
                eg.f(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        qmo1.E(this, objectOutputStream);
    }

    @Override // p.x8
    public final boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // p.x8
    public final Collection f() {
        return new l380(this);
    }

    @Override // p.x8
    public final Collection h() {
        return super.h();
    }

    @Override // p.x8
    public final Iterator i() {
        return new k380(this);
    }

    @Override // p.x8
    public final Collection j(Object obj) {
        b380 b380Var = (b380) this.e.get(obj);
        if (b380Var != null) {
            return b380Var;
        }
        w280 w280Var = b380.b;
        return bg11.e;
    }

    @Override // p.x8
    public final Set k() {
        return this.e.i();
    }

    @Override // p.x8
    public final boolean l(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // p.x8
    public final int m() {
        return this.f;
    }

    @Override // p.x8
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public j380 a() {
        return this.e;
    }
}
