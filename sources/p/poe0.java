package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class poe0 extends soe0 implements xgo0 {
    public volatile ke71 d;
    public final /* synthetic */ p5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poe0(voe0 voe0Var, ka kaVar, p5 p5Var) {
        super(voe0Var, kaVar);
        this.e = p5Var;
        this.d = null;
    }

    public static /* synthetic */ void e(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    @Override // p.soe0
    public final void a(Object obj) {
        this.d = new ke71(obj);
        try {
            if (obj == null) {
                e(2);
                throw null;
            }
            this.e.invoke(obj);
            this.d = null;
        } catch (Throwable th) {
            this.d = null;
            throw th;
        }
    }

    @Override // p.soe0
    public final lls0 d(boolean z) {
        return new lls0(new la(Collections.singletonList(bkz.d)), false, (byte) 28);
    }

    @Override // p.soe0
    public final Object invoke() {
        Object objInvoke;
        ke71 ke71Var = this.d;
        if (ke71Var == null || ((Thread) ke71Var.c) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else if (((Thread) ke71Var.c) == Thread.currentThread()) {
            objInvoke = ke71Var.b;
        } else {
            eg.m("No value in this thread (hasValue should be checked before)");
            objInvoke = null;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute", "invoke"));
    }
}
