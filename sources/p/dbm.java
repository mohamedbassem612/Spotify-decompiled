package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dbm {
    public Object a;
    public volatile Object b;

    public dbm(byte b) {
        switch (b) {
            case 3:
                this.b = UUID.randomUUID();
                this.a = new ConcurrentHashMap();
                break;
            default:
                this.a = new CopyOnWriteArraySet();
                break;
        }
    }

    public void a(n2q0 n2q0Var) {
        if (((Context) this.b) != null) {
            n2q0Var.a();
        }
        ((CopyOnWriteArraySet) this.a).add(n2q0Var);
    }

    public Completable b(int i, pr5 pr5Var) {
        return Completable.f(new CompletableSource[]{c(i), new CompletableFromAction(new w43(pr5Var, (byte) 5)), new CompletableFromAction(new w43(pr5Var, (byte) 4))});
    }

    public Completable c(int i) {
        return Completable.f(new CompletableSource[]{new CompletableFromAction(new w43(this, (byte) 6)), new CompletableFromAction(new ok70(this, i))});
    }

    public void d() {
        this.b = null;
    }

    public void e(Context context) {
        this.b = context;
        Iterator it = ((CopyOnWriteArraySet) this.a).iterator();
        while (it.hasNext()) {
            ((n2q0) it.next()).a();
        }
    }

    public boolean f(String str, double d) {
        if (d > 0.0d) {
            if (d >= 1.0d) {
                return true;
            }
            if (u890.E(ByteBuffer.wrap(MessageDigest.getInstance("SHA-256").digest((((UUID) this.b) + ":" + str).getBytes(nne.a)), 0, 8).getLong()) / 1.8446744073709552E19d < d) {
                return true;
            }
        }
        return false;
    }

    public boolean g(vgp0 vgp0Var) {
        boolean zF;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        String strA = vgp0Var.a();
        Object obj = concurrentHashMap.get(strA);
        if (obj == null) {
            t641 t641Var = vgp0Var.c;
            if (t641Var instanceof s641) {
                zF = true;
            } else if (t641Var instanceof u641) {
                zF = f(vgp0Var.a(), ((u641) t641Var).a);
            } else {
                if (!(t641Var instanceof t641)) {
                    eg.o();
                    return false;
                }
                zF = f(vgp0Var.a(), ((Number) t641Var.a.invoke(vgp0Var)).doubleValue());
            }
            Boolean boolValueOf = Boolean.valueOf(zF);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(strA, boolValueOf);
            obj = objPutIfAbsent == null ? boolValueOf : objPutIfAbsent;
        }
        return ((Boolean) obj).booleanValue();
    }

    public void h(d9d0 d9d0Var) {
        ((g960) this.a).execute(new sjj1(this, d9d0Var, (byte) 6));
    }
}
