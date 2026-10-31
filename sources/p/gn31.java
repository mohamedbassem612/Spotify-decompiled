package p;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gn31 extends ymd0 {
    public final kn31 O0;
    public final o8n S0;
    public final axl1 T0;
    public final en31 Y;
    public final ro30 Z;
    public final boolean N0 = true;
    public final AtomicBoolean P0 = new AtomicBoolean(true);
    public final AtomicBoolean Q0 = new AtomicBoolean(false);
    public final AtomicBoolean R0 = new AtomicBoolean(false);

    public gn31(en31 en31Var, ro30 ro30Var, String[] strArr, axl1 axl1Var) {
        o8n o8nVar;
        this.Y = en31Var;
        this.Z = ro30Var;
        this.O0 = new kn31(strArr, this);
        if (en31Var.m()) {
            o8nVar = en31Var.b;
            if (o8nVar == null) {
                u890.C("transactionContext");
                throw null;
            }
        } else {
            o8nVar = o6x.a;
        }
        this.S0 = o8nVar;
        this.T0 = axl1Var;
    }

    public final void h() {
        ((Set) this.Z.c).add(this);
        llm llmVar = this.Y.a;
        if (llmVar == null) {
            u890.C("coroutineScope");
            throw null;
        }
        fn31.T(llmVar, this.S0, 0, new jn31(this, null, (byte) 1), 2);
    }

    public final void i() {
        ((Set) this.Z.c).remove(this);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd A[Catch: all -> 0x0039, Exception -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x002f, B:44:0x00bd), top: B:62:0x002f, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce A[LOOP:0: B:42:0x00b7->B:48:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00db A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x002f, B:42:0x00b7, B:44:0x00bd, B:52:0x00db, B:49:0x00d1, B:50:0x00d8), top: B:62:0x002f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b5 -> B:42:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00e6 -> B:57:0x00e7). Please report as a decompilation issue!!! */
    public final Object n(onm onmVar) {
        ln31 ln31Var;
        boolean z;
        Object obj;
        Object objZ;
        d9n d9nVar;
        if (onmVar instanceof ln31) {
            ln31Var = (ln31) onmVar;
            int i = ln31Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                ln31Var.d = i - os00.INVALID_ID;
            } else {
                ln31Var = new ln31(this, onmVar);
            }
        } else {
            ln31Var = new ln31(this, onmVar);
        }
        Object obj2 = ln31Var.b;
        int i2 = ln31Var.d;
        AtomicBoolean atomicBoolean = this.P0;
        en31 en31Var = this.Y;
        AtomicBoolean atomicBoolean2 = this.Q0;
        if (i2 == 0) {
            hm5.M(obj2);
            if (this.R0.compareAndSet(false, true)) {
                ec90 ec90VarH = en31Var.h();
                dgl1 dgl1Var = new dgl1(ec90VarH, this.O0);
                LinkedHashMap linkedHashMap = ec90VarH.c;
                bvg1 bvg1Var = ec90VarH.b;
                mmr0 mmr0VarG = bvg1Var.g(dgl1Var.a());
                String[] strArr = (String[]) mmr0VarG.a;
                int[] iArr = (int[]) mmr0VarG.b;
                vjp0 vjp0Var = new vjp0(dgl1Var, iArr, strArr);
                ReentrantLock reentrantLock = ec90VarH.d;
                reentrantLock.lock();
                try {
                    vjp0 vjp0Var2 = linkedHashMap.containsKey(dgl1Var) ? (vjp0) sqg0.G(dgl1Var, linkedHashMap) : (vjp0) linkedHashMap.put(dgl1Var, vjp0Var);
                    reentrantLock.unlock();
                    if (vjp0Var2 == null && bvg1Var.h.a(iArr)) {
                        yah0.x(new mx(ec90VarH, (lnm) null, (byte) 27));
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            if (atomicBoolean2.compareAndSet(false, true)) {
                obj = null;
                z = false;
                while (atomicBoolean.compareAndSet(true, false)) {
                    ln31Var.a = true;
                    ln31Var.d = 1;
                    objZ = qyo1.z(ln31Var, this.T0, en31Var, true, this.N0);
                    d9nVar = d9n.a;
                    if (objZ == d9nVar) {
                        return d9nVar;
                    }
                    obj = objZ;
                    z = true;
                }
                if (z) {
                    j(obj);
                }
                atomicBoolean2.set(false);
            } else {
                z = false;
            }
            if (z) {
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z2 = ln31Var.a;
        try {
            try {
                hm5.M(obj2);
                obj = obj2;
                z = z2;
                while (atomicBoolean.compareAndSet(true, false)) {
                    ln31Var.a = true;
                    ln31Var.d = 1;
                    objZ = qyo1.z(ln31Var, this.T0, en31Var, true, this.N0);
                    d9nVar = d9n.a;
                    if (objZ == d9nVar) {
                        return d9nVar;
                    }
                    obj = objZ;
                    z = true;
                }
                if (z) {
                    j(obj);
                }
                atomicBoolean2.set(false);
                if (z || !atomicBoolean.get()) {
                    return rih1.a;
                }
                if (atomicBoolean2.compareAndSet(false, true)) {
                    obj = null;
                    z = false;
                    while (atomicBoolean.compareAndSet(true, false)) {
                        ln31Var.a = true;
                        ln31Var.d = 1;
                        objZ = qyo1.z(ln31Var, this.T0, en31Var, true, this.N0);
                        d9nVar = d9n.a;
                        if (objZ == d9nVar) {
                            return d9nVar;
                        }
                        obj = objZ;
                        z = true;
                    }
                    if (z) {
                        j(obj);
                    }
                    atomicBoolean2.set(false);
                } else {
                    z = false;
                }
                if (z) {
                }
                return rih1.a;
            } catch (Exception e) {
                throw new RuntimeException("Exception while computing database live data.", e);
            }
        } catch (Throwable th2) {
            atomicBoolean2.set(false);
            throw th2;
        }
    }
}
