package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tn80 extends a8d1 implements vu30 {
    public Object a;
    public Object b;
    public Object c;
    public qn80[] d;
    public qn80[] e;
    public byte f;
    public byte g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Context i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn80(Context context, lnm lnmVar) {
        super(2, lnmVar);
        this.i = context;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        tn80 tn80Var = new tn80(this.i, lnmVar);
        tn80Var.h = obj;
        return tn80Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x012d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0146  */
    /* JADX WARN: Code duplicated, block: B:35:0x015c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0177  */
    /* JADX WARN: Code duplicated, block: B:42:0x0181  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x0217  */
    /* JADX WARN: Code duplicated, block: B:80:0x0237  */
    /* JADX WARN: Code duplicated, block: B:83:0x0242  */
    /* JADX WARN: Code duplicated, block: B:86:0x0254  */
    /* JADX WARN: Code duplicated, block: B:93:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[LOOP:0: B:40:0x017b->B:94:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f6 A[SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        qn80[] qn80VarArr;
        Object objQ;
        l2t l2tVar;
        l2t l2tVar2;
        l2t l2tVar3;
        l2t l2tVar4;
        byte b;
        qn80[] qn80VarArr2;
        Object objE;
        qn80[] qn80VarArr3;
        Object objE2;
        qn80[] qn80VarArr4;
        l2t l2tVar5;
        Object objE3;
        qn80[] qn80VarArr5;
        Object objE4;
        qn80[] qn80VarArr6;
        qn80 qn80VarW;
        List list;
        ArrayList arrayListO0;
        Iterator it;
        String str;
        Iterator it2;
        Object next;
        qn80 qn80Var;
        Iterator it3;
        Object next2;
        qn80 qn80Var2;
        ArrayList arrayList;
        Iterator it4;
        long j;
        Object next3;
        long j2;
        String str2;
        String str3;
        String str4;
        String str5;
        byte b2 = this.g;
        byte b3 = 4;
        byte b4 = 3;
        byte b5 = 2;
        byte b6 = 1;
        Object next4 = null;
        d9n d9nVar = d9n.a;
        if (b2 == 0) {
            hm5.M(obj);
            c9n c9nVar = (c9n) this.h;
            Context context = this.i;
            s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new sn80(context, null, (byte) 1), 3);
            l2t l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new sn80(context, null, (byte) 2), 3);
            l2t l2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new sn80(context, null, (byte) 4), 3);
            l2t l2tVarQ3 = fn31.q(c9nVar, (o8n) null, 0, new sn80(context, null, (byte) 5), 3);
            l2t l2tVarQ4 = fn31.q(c9nVar, (o8n) null, 0, new sn80(context, null, (byte) 3), 3);
            qn80VarArr = new qn80[5];
            this.h = l2tVarQ;
            this.a = l2tVarQ2;
            this.b = l2tVarQ3;
            this.c = l2tVarQ4;
            this.d = qn80VarArr;
            this.e = qn80VarArr;
            this.f = (byte) 0;
            this.g = (byte) 1;
            objQ = s2tVarQ.Q(this);
            if (objQ != d9nVar) {
                l2tVar = l2tVarQ;
                l2tVar2 = l2tVarQ3;
                l2tVar3 = l2tVarQ2;
                l2tVar4 = l2tVarQ4;
                b = 0;
                qn80VarArr2 = qn80VarArr;
            }
            return d9nVar;
        }
        if (b2 == 1) {
            b = this.f;
            qn80[] qn80VarArr7 = this.e;
            qn80VarArr = this.d;
            l2t l2tVar6 = (l2t) this.c;
            l2t l2tVar7 = (l2t) this.b;
            l2tVar3 = (l2t) this.a;
            l2t l2tVar8 = (l2t) this.h;
            hm5.M(obj);
            l2tVar = l2tVar8;
            l2tVar2 = l2tVar7;
            l2tVar4 = l2tVar6;
            qn80VarArr2 = qn80VarArr7;
            objQ = obj;
        } else {
            if (b2 == 2) {
                b6 = this.f;
                qn80[] qn80VarArr8 = this.d;
                qn80VarArr3 = (qn80[]) this.c;
                l2t l2tVar9 = (l2t) this.b;
                l2t l2tVar10 = (l2t) this.a;
                l2t l2tVar11 = (l2t) this.h;
                hm5.M(obj);
                l2tVar2 = l2tVar10;
                l2tVar3 = l2tVar11;
                l2tVar4 = l2tVar9;
                qn80VarArr = qn80VarArr8;
                objE = obj;
                qn80VarArr[b6] = (qn80) objE;
                this.h = l2tVar2;
                this.a = l2tVar4;
                this.b = qn80VarArr3;
                this.c = qn80VarArr3;
                this.d = null;
                this.f = (byte) 2;
                this.g = (byte) 3;
                objE2 = l2tVar3.E(this);
                if (objE2 != d9nVar) {
                    qn80VarArr4 = qn80VarArr3;
                    l2tVar5 = l2tVar2;
                    qn80VarArr3[b5] = (qn80) objE2;
                    this.h = l2tVar4;
                    this.a = qn80VarArr4;
                    this.b = qn80VarArr4;
                    this.c = null;
                    this.f = (byte) 3;
                    this.g = (byte) 4;
                    objE3 = l2tVar5.E(this);
                    if (objE3 != d9nVar) {
                        qn80VarArr5 = qn80VarArr4;
                        qn80VarArr4[b4] = (qn80) objE3;
                        this.h = qn80VarArr5;
                        this.a = qn80VarArr5;
                        this.b = null;
                        this.f = (byte) 4;
                        this.g = (byte) 5;
                        objE4 = l2tVar4.E(this);
                        if (objE4 != d9nVar) {
                            qn80VarArr6 = qn80VarArr5;
                        }
                    }
                }
                return d9nVar;
            }
            if (b2 == 3) {
                b5 = this.f;
                qn80[] qn80VarArr9 = (qn80[]) this.c;
                qn80VarArr4 = (qn80[]) this.b;
                l2t l2tVar12 = (l2t) this.a;
                l2tVar5 = (l2t) this.h;
                hm5.M(obj);
                l2tVar4 = l2tVar12;
                qn80VarArr3 = qn80VarArr9;
                objE2 = obj;
                qn80VarArr3[b5] = (qn80) objE2;
                this.h = l2tVar4;
                this.a = qn80VarArr4;
                this.b = qn80VarArr4;
                this.c = null;
                this.f = (byte) 3;
                this.g = (byte) 4;
                objE3 = l2tVar5.E(this);
                if (objE3 != d9nVar) {
                    qn80VarArr5 = qn80VarArr4;
                    qn80VarArr4[b4] = (qn80) objE3;
                    this.h = qn80VarArr5;
                    this.a = qn80VarArr5;
                    this.b = null;
                    this.f = (byte) 4;
                    this.g = (byte) 5;
                    objE4 = l2tVar4.E(this);
                    if (objE4 != d9nVar) {
                        qn80VarArr6 = qn80VarArr5;
                    }
                }
                return d9nVar;
            }
            if (b2 == 4) {
                b4 = this.f;
                qn80[] qn80VarArr10 = (qn80[]) this.b;
                qn80VarArr5 = (qn80[]) this.a;
                l2t l2tVar13 = (l2t) this.h;
                hm5.M(obj);
                l2tVar4 = l2tVar13;
                qn80VarArr4 = qn80VarArr10;
                objE3 = obj;
                qn80VarArr4[b4] = (qn80) objE3;
                this.h = qn80VarArr5;
                this.a = qn80VarArr5;
                this.b = null;
                this.f = (byte) 4;
                this.g = (byte) 5;
                objE4 = l2tVar4.E(this);
                if (objE4 != d9nVar) {
                    qn80VarArr6 = qn80VarArr5;
                }
                return d9nVar;
            }
            if (b2 != 5) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b3 = this.f;
            qn80VarArr6 = (qn80[]) this.a;
            qn80[] qn80VarArr11 = (qn80[]) this.h;
            hm5.M(obj);
            qn80VarArr5 = qn80VarArr11;
            objE4 = obj;
        }
        qn80VarArr6[b3] = (qn80) objE4;
        List listM = p7h.M(qn80VarArr5);
        qn80VarW = i9p1.w(listM);
        list = listM;
        arrayListO0 = o7h.o0(list);
        if (!arrayListO0.isEmpty()) {
            it = arrayListO0.iterator();
            while (it.hasNext()) {
                str = ((qn80) it.next()).a;
                f4t f4tVar = f4t.b;
                if (u890.j(str, "Meta")) {
                    qn80VarW.getClass();
                    it2 = o7h.o0(list).iterator();
                    do {
                        if (it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        str5 = ((qn80) next).a;
                        f4t f4tVar2 = f4t.b;
                    } while (!u890.j(str5, "Meta"));
                    qn80Var = (qn80) next;
                    qn80Var.getClass();
                    if (qn80Var.g) {
                        str4 = qn80VarW.a;
                        f4t f4tVar3 = f4t.b;
                        if (u890.j(str4, "PlayStore") || qn80VarW.d != qn80Var.d) {
                            return qn80VarW;
                        }
                    } else {
                        it3 = o7h.o0(list).iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                            str3 = ((qn80) next2).a;
                            f4t f4tVar4 = f4t.b;
                        } while (!u890.j(str3, "PlayStore"));
                        qn80Var2 = (qn80) next2;
                        if (qn80Var2 != null || qn80Var2.d != 0) {
                            ArrayList arrayListO1 = o7h.o0(list);
                            arrayList = new ArrayList();
                            for (Object obj2 : arrayListO1) {
                                str2 = ((qn80) obj2).a;
                                f4t f4tVar5 = f4t.b;
                                if (!u890.j(str2, "Meta")) {
                                    arrayList.add(obj2);
                                }
                            }
                            it4 = arrayList.iterator();
                            if (it4.hasNext()) {
                                next4 = it4.next();
                                if (it4.hasNext()) {
                                    j = ((qn80) next4).b;
                                    do {
                                        next3 = it4.next();
                                        j2 = ((qn80) next3).b;
                                        if (j < j2) {
                                            next4 = next3;
                                            j = j2;
                                        }
                                    } while (it4.hasNext());
                                }
                            }
                            return (qn80) next4;
                        }
                    }
                    return qn80Var;
                }
            }
        }
        return qn80VarW;
        qn80VarArr2[b] = (qn80) objQ;
        this.h = l2tVar3;
        this.a = l2tVar2;
        this.b = l2tVar4;
        this.c = qn80VarArr;
        this.d = qn80VarArr;
        this.e = null;
        this.f = (byte) 1;
        this.g = (byte) 2;
        objE = l2tVar.E(this);
        if (objE != d9nVar) {
            qn80VarArr3 = qn80VarArr;
            qn80VarArr[b6] = (qn80) objE;
            this.h = l2tVar2;
            this.a = l2tVar4;
            this.b = qn80VarArr3;
            this.c = qn80VarArr3;
            this.d = null;
            this.f = (byte) 2;
            this.g = (byte) 3;
            objE2 = l2tVar3.E(this);
            if (objE2 != d9nVar) {
                qn80VarArr4 = qn80VarArr3;
                l2tVar5 = l2tVar2;
                qn80VarArr3[b5] = (qn80) objE2;
                this.h = l2tVar4;
                this.a = qn80VarArr4;
                this.b = qn80VarArr4;
                this.c = null;
                this.f = (byte) 3;
                this.g = (byte) 4;
                objE3 = l2tVar5.E(this);
                if (objE3 != d9nVar) {
                    qn80VarArr5 = qn80VarArr4;
                    qn80VarArr4[b4] = (qn80) objE3;
                    this.h = qn80VarArr5;
                    this.a = qn80VarArr5;
                    this.b = null;
                    this.f = (byte) 4;
                    this.g = (byte) 5;
                    objE4 = l2tVar4.E(this);
                    if (objE4 != d9nVar) {
                        qn80VarArr6 = qn80VarArr5;
                        qn80VarArr6[b3] = (qn80) objE4;
                        List listM2 = p7h.M(qn80VarArr5);
                        qn80VarW = i9p1.w(listM2);
                        list = listM2;
                        arrayListO0 = o7h.o0(list);
                        if (!arrayListO0.isEmpty()) {
                            it = arrayListO0.iterator();
                            while (it.hasNext()) {
                                str = ((qn80) it.next()).a;
                                f4t f4tVar6 = f4t.b;
                                if (u890.j(str, "Meta")) {
                                    qn80VarW.getClass();
                                    it2 = o7h.o0(list).iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                        str5 = ((qn80) next).a;
                                        f4t f4tVar7 = f4t.b;
                                    } while (!u890.j(str5, "Meta"));
                                    qn80Var = (qn80) next;
                                    qn80Var.getClass();
                                    if (qn80Var.g) {
                                        str4 = qn80VarW.a;
                                        f4t f4tVar8 = f4t.b;
                                        if (u890.j(str4, "PlayStore")) {
                                        }
                                        return qn80VarW;
                                    }
                                    it3 = o7h.o0(list).iterator();
                                    do {
                                        if (it3.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it3.next();
                                        str3 = ((qn80) next2).a;
                                        f4t f4tVar9 = f4t.b;
                                    } while (!u890.j(str3, "PlayStore"));
                                    qn80Var2 = (qn80) next2;
                                    if (qn80Var2 != null) {
                                    }
                                    ArrayList arrayListO2 = o7h.o0(list);
                                    arrayList = new ArrayList();
                                    while (r0.hasNext()) {
                                        str2 = ((qn80) obj2).a;
                                        f4t f4tVar10 = f4t.b;
                                        if (!u890.j(str2, "Meta")) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    it4 = arrayList.iterator();
                                    if (it4.hasNext()) {
                                        next4 = it4.next();
                                        if (it4.hasNext()) {
                                            j = ((qn80) next4).b;
                                            do {
                                                next3 = it4.next();
                                                j2 = ((qn80) next3).b;
                                                if (j < j2) {
                                                    next4 = next3;
                                                    j = j2;
                                                }
                                            } while (it4.hasNext());
                                        }
                                    }
                                    return (qn80) next4;
                                    return qn80Var;
                                }
                            }
                        }
                        return qn80VarW;
                    }
                }
            }
        }
        return d9nVar;
    }
}
