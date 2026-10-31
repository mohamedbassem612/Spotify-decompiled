package p;

import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class avw0 implements Function, Predicate, BiPredicate, d5q0, s5n1, v0i {
    public final /* synthetic */ byte a;
    public static final avw0 b = new avw0(0);
    public static final avw0 c = new avw0(1);
    public static final f431 d = new f431();
    public static final avw0 e = new avw0(3);
    public static final avw0 f = new avw0(4);
    public static final avw0 g = new avw0(5);
    public static final t2b h = new t2b((byte) 26);
    public static final avw0 i = new avw0(7);
    public static final avw0 t = new avw0(8);
    public static final /* synthetic */ avw0 X = new avw0(9);

    public avw0(n381 n381Var, Scheduler scheduler) {
        this.a = (byte) 19;
    }

    public static void a(l420 l420Var) throws IOException {
        File file = l420Var.b;
        if (!file.exists()) {
            n9v.j(l420Var, " does not exist");
            return;
        }
        if (!file.isDirectory()) {
            n9v.j(l420Var, " is not a directory");
            return;
        }
        File[] fileArrB = l420Var.b();
        IOException e2 = null;
        if (fileArrB != null) {
            for (File file2 : fileArrB) {
                try {
                    u520.f(file2);
                } catch (IOException e3) {
                    e2 = e3;
                }
            }
        }
        if (e2 != null) {
            throw e2;
        }
    }

    public static void c(g3r g3rVar, l420 l420Var) {
        File file = l420Var.b;
        if (!file.exists()) {
            l420 l420VarA = l420Var.a();
            if (l420VarA != null && !l420VarA.mkdirs() && !l420VarA.b.isDirectory()) {
                n9v.n("Directory '", l420VarA, "' could not be created");
                return;
            }
        } else if (file.isDirectory()) {
            n9v.n("File '", l420Var, "' exists but is a directory");
            return;
        } else if (!file.canWrite()) {
            n9v.n("File '", l420Var, "' cannot be written to");
            return;
        }
        r420 r420VarL = l420Var.a.l(l420Var);
        try {
            int i2 = uh70.a;
            byte[] bArr = new byte[4096];
            while (true) {
                int i3 = g3rVar.read(bArr);
                if (-1 == i3) {
                    r420VarL.close();
                    return;
                }
                r420VarL.write(bArr, 0, i3);
            }
        } finally {
            uh70.a(r420VarL);
        }
    }

    public static void d(l420 l420Var) throws IOException {
        if (l420Var.b.exists()) {
            if (!u520.g(l420Var)) {
                a(l420Var);
            }
            if (l420Var.delete()) {
                return;
            }
            n9v.m("Unable to delete directory ", l420Var, ".");
        }
    }

    public static String e(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        bArrDigest.getClass();
        return f46.r0(bArrDigest, fbo.d1, 30);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new fvw0((Throwable) obj);
            case 1:
                return ((PlayerState) obj).track();
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            default:
                pze0.m(obj);
                throw null;
            case 3:
                return rih1.a;
            case 5:
                ((gxe0) obj).a.E().invoke();
                return new kn00(false, null);
            case 7:
                return Boolean.valueOf(yto.j((String) obj));
            case 10:
                int iOrdinal = ((EsAuthStorageResult.AuthStorageResult) obj).o().ordinal();
                if (iOrdinal == 0) {
                    return wh8.a;
                }
                if (iOrdinal != 1) {
                    return iOrdinal != 2 ? vh8.a : vh8.b;
                }
                return vh8.c;
        }
    }

    public Object b() {
        return new kuw0((byte) 21);
    }

    public void i(Exception exc) {
        f3m0.c();
    }

    public Object m(dxy dxyVar) {
        return new p321(dxyVar.c(lzy0.a(o321.class)));
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        spq0 spq0Var = (spq0) obj;
        spq0 spq0Var2 = (spq0) obj2;
        l0l l0lVar = (l0l) spq0Var.h();
        String strD = l0lVar != null ? l0lVar.d() : null;
        l0l l0lVar2 = (l0l) spq0Var2.h();
        if (!u890.j(strD, l0lVar2 != null ? l0lVar2.d() : null)) {
            return false;
        }
        l0l l0lVar3 = (l0l) spq0Var.h();
        Boolean boolValueOf = l0lVar3 != null ? Boolean.valueOf(l0lVar3.F()) : null;
        l0l l0lVar4 = (l0l) spq0Var2.h();
        if (!u890.j(boolValueOf, l0lVar4 != null ? Boolean.valueOf(l0lVar4.F()) : null)) {
            return false;
        }
        l0l l0lVar5 = (l0l) spq0Var.h();
        Integer numValueOf = l0lVar5 != null ? Integer.valueOf(l0lVar5.A()) : null;
        l0l l0lVar6 = (l0l) spq0Var2.h();
        return u890.j(numValueOf, l0lVar6 != null ? Integer.valueOf(l0lVar6.A()) : null);
    }

    public /* synthetic */ avw0(Object obj, byte b2) {
        this.a = b2;
    }

    public /* synthetic */ avw0(byte b2) {
        this.a = b2;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return ((tv00) obj).b != null;
    }
}
