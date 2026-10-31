package p;

import android.app.Activity;
import io.reactivex.rxjava3.subjects.SingleSubject;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tc31 {
    public final Activity a;
    public final nw40 b;
    public final q8n c;

    public tc31(Activity activity, nw40 nw40Var, q8n q8nVar) {
        this.a = activity;
        this.b = nw40Var;
        this.c = q8nVar;
    }

    public final Object a(uie uieVar, v721 v721Var, fc21 fc21Var) {
        return b(2131960129, uieVar, v721Var, n521.R0, fc21Var);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object b(int i, iu30 iu30Var, iu30 iu30Var2, Function0 function0, onm onmVar) {
        rc31 rc31Var;
        Function0 function1;
        iu30 iu30Var3;
        Object obj;
        iu30 iu30Var4;
        int i2;
        Function0 function2;
        SingleSubject singleSubject;
        int i3;
        iu30 iu30Var5;
        iu30 iu30Var6;
        Function0 function3;
        Object objB;
        tc31 tc31Var = this;
        if (onmVar instanceof rc31) {
            rc31Var = (rc31) onmVar;
            int i4 = rc31Var.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rc31Var.h = i4 - Integer.MIN_VALUE;
            } else {
                rc31Var = new rc31(tc31Var, onmVar);
            }
        } else {
            rc31Var = new rc31(tc31Var, onmVar);
        }
        rc31 rc31Var2 = rc31Var;
        Object objJ = rc31Var2.f;
        int i5 = rc31Var2.h;
        d9n d9nVar = d9n.a;
        if (i5 == 0) {
            hm5.M(objJ);
            rc31Var2.b = iu30Var;
            rc31Var2.c = iu30Var2;
            function1 = function0;
            rc31Var2.d = function1;
            rc31Var2.a = i;
            rc31Var2.h = 1;
            Object objInvoke = iu30Var.invoke(rc31Var2);
            if (objInvoke != d9nVar) {
                iu30Var3 = iu30Var;
                obj = objInvoke;
                iu30Var4 = iu30Var2;
                i2 = i;
            }
            return d9nVar;
        }
        if (i5 == 1) {
            int i6 = rc31Var2.a;
            function1 = rc31Var2.d;
            iu30Var4 = rc31Var2.c;
            iu30 iu30Var7 = rc31Var2.b;
            hm5.M(objJ);
            i2 = i6;
            obj = objJ;
            iu30Var3 = iu30Var7;
        } else {
            if (i5 == 2) {
                i3 = rc31Var2.a;
                singleSubject = rc31Var2.e;
                Function0 function4 = rc31Var2.d;
                iu30 iu30Var8 = rc31Var2.c;
                iu30 iu30Var9 = rc31Var2.b;
                hm5.M(objJ);
                function2 = function4;
                iu30Var4 = iu30Var8;
                iu30Var5 = iu30Var9;
                rc31Var2.b = iu30Var5;
                rc31Var2.c = iu30Var4;
                rc31Var2.d = function2;
                rc31Var2.e = null;
                rc31Var2.a = i3;
                rc31Var2.h = 3;
                objJ = fc11.j(singleSubject, rc31Var2);
                if (objJ != d9nVar) {
                    iu30Var6 = iu30Var4;
                    function3 = function2;
                }
                return d9nVar;
            }
            if (i5 != 3) {
                if (i5 == 4) {
                    hm5.M(objJ);
                    return objJ;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = rc31Var2.a;
            Function0 function5 = rc31Var2.d;
            iu30 iu30Var10 = rc31Var2.c;
            iu30Var5 = rc31Var2.b;
            hm5.M(objJ);
            function3 = function5;
            iu30Var6 = iu30Var10;
        }
        if (((qc31) objJ) == qc31.a) {
            return null;
        }
        rc31Var2.b = null;
        rc31Var2.c = null;
        rc31Var2.d = null;
        rc31Var2.e = null;
        rc31Var2.a = i3;
        rc31Var2.h = 4;
        objB = tc31Var.b(i3, iu30Var5, iu30Var6, function3, rc31Var2);
        if (objB != d9nVar) {
            return d9nVar;
        }
        return objB;
        function2 = function1;
        if (obj != null) {
            return obj;
        }
        singleSubject = (SingleSubject) function2.invoke();
        m7s m7sVar = new m7s((Object) this, i2, (Object) singleSubject, (Object) iu30Var4, (lnm) null, (byte) 4);
        tc31Var = this;
        rc31Var2.b = iu30Var3;
        rc31Var2.c = iu30Var4;
        rc31Var2.d = function2;
        rc31Var2.e = singleSubject;
        rc31Var2.a = i2;
        rc31Var2.h = 2;
        if (fn31.Y(tc31Var.c, m7sVar, rc31Var2) != d9nVar) {
            i3 = i2;
            iu30Var5 = iu30Var3;
            rc31Var2.b = iu30Var5;
            rc31Var2.c = iu30Var4;
            rc31Var2.d = function2;
            rc31Var2.e = null;
            rc31Var2.a = i3;
            rc31Var2.h = 3;
            objJ = fc11.j(singleSubject, rc31Var2);
            if (objJ != d9nVar) {
                iu30Var6 = iu30Var4;
                function3 = function2;
                if (((qc31) objJ) == qc31.a) {
                    return null;
                }
                rc31Var2.b = null;
                rc31Var2.c = null;
                rc31Var2.d = null;
                rc31Var2.e = null;
                rc31Var2.a = i3;
                rc31Var2.h = 4;
                objB = tc31Var.b(i3, iu30Var5, iu30Var6, function3, rc31Var2);
                if (objB != d9nVar) {
                    return objB;
                }
            }
        }
        return d9nVar;
    }
}
