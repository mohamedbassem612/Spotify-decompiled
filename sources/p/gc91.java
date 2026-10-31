package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gc91 extends z031 implements vu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public byte f;
    public /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Iterator t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc91(int i, int i2, Iterator it, boolean z, boolean z2, lnm lnmVar) {
        super(2, lnmVar);
        this.h = i;
        this.i = i2;
        this.t = it;
        this.X = z;
        this.Y = z2;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        gc91 gc91Var = new gc91(this.h, this.i, this.t, this.X, this.Y, lnmVar);
        gc91Var.g = obj;
        return gc91Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((gc91) create((r561) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x013a  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x008e A[SYNTHETIC] */
    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        th31 th31Var;
        Iterator it;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        Iterator it2;
        Object next;
        int i6;
        th31 th31Var2;
        th31 arrayList2;
        th31 arrayList3;
        r561 r561Var = (r561) this.g;
        byte b = this.f;
        boolean z = this.Y;
        boolean z2 = this.X;
        int i7 = this.i;
        int i8 = this.h;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            i = i8 <= 1024 ? i8 : 1024;
            i2 = i7 - i8;
            Iterator it3 = this.t;
            if (i2 >= 0) {
                arrayList = new ArrayList(i);
                i3 = i;
                i4 = i2;
                i5 = 0;
                it2 = it3;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i8) {
                            this.g = r561Var;
                            this.b = arrayList;
                            this.c = it2;
                            this.d = i3;
                            this.e = i4;
                            this.f = (byte) 1;
                            r561Var.b(arrayList, this);
                            return d9nVar;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.g = null;
                    this.b = null;
                    this.c = null;
                    this.d = i3;
                    this.e = i4;
                    this.f = (byte) 2;
                    r561Var.b(arrayList, this);
                    return d9nVar;
                }
            } else {
                th31Var = new th31(i);
                it = it3;
                while (it.hasNext()) {
                    th31Var.c(it.next());
                    if (!th31Var.e()) {
                        if (th31Var.b() < i8) {
                            if (z2) {
                                arrayList2 = th31Var;
                            } else {
                                arrayList2 = new ArrayList((Collection) th31Var);
                            }
                            this.g = r561Var;
                            this.b = th31Var;
                            this.c = it;
                            this.d = i;
                            this.e = i2;
                            this.f = (byte) 3;
                            r561Var.b(arrayList2, this);
                            return d9nVar;
                        }
                        th31Var = th31Var.d(i8);
                    }
                }
                if (z) {
                    i6 = i;
                    th31Var2 = th31Var;
                    if (th31Var2.b() > i7) {
                        if (z2) {
                            arrayList3 = th31Var2;
                        } else {
                            arrayList3 = new ArrayList((Collection) th31Var2);
                        }
                        this.g = r561Var;
                        this.b = th31Var2;
                        this.c = null;
                        this.d = i6;
                        this.e = i2;
                        this.f = (byte) 4;
                        r561Var.b(arrayList3, this);
                        return d9nVar;
                    }
                    if (!th31Var2.isEmpty()) {
                        this.g = null;
                        this.b = null;
                        this.c = null;
                        this.d = i6;
                        this.e = i2;
                        this.f = (byte) 5;
                        r561Var.b(th31Var2, this);
                        return d9nVar;
                    }
                }
            }
        } else if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    i2 = this.e;
                    int i9 = this.d;
                    it = this.c;
                    th31 th31Var3 = (th31) this.b;
                    hm5.M(obj);
                    th31Var3.f(i7);
                    i = i9;
                    th31Var = th31Var3;
                    while (it.hasNext()) {
                        th31Var.c(it.next());
                        if (!th31Var.e()) {
                            if (th31Var.b() < i8) {
                                if (z2) {
                                    arrayList2 = th31Var;
                                } else {
                                    arrayList2 = new ArrayList((Collection) th31Var);
                                }
                                this.g = r561Var;
                                this.b = th31Var;
                                this.c = it;
                                this.d = i;
                                this.e = i2;
                                this.f = (byte) 3;
                                r561Var.b(arrayList2, this);
                                return d9nVar;
                            }
                            th31Var = th31Var.d(i8);
                        }
                    }
                    if (z) {
                        i6 = i;
                        th31Var2 = th31Var;
                    }
                } else if (b == 4) {
                    i2 = this.e;
                    i6 = this.d;
                    th31Var2 = (th31) this.b;
                    hm5.M(obj);
                    th31Var2.f(i7);
                } else {
                    if (b != 5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (th31Var2.b() > i7) {
                    if (z2) {
                        arrayList3 = th31Var2;
                    } else {
                        arrayList3 = new ArrayList((Collection) th31Var2);
                    }
                    this.g = r561Var;
                    this.b = th31Var2;
                    this.c = null;
                    this.d = i6;
                    this.e = i2;
                    this.f = (byte) 4;
                    r561Var.b(arrayList3, this);
                    return d9nVar;
                }
                if (!th31Var2.isEmpty()) {
                    this.g = null;
                    this.b = null;
                    this.c = null;
                    this.d = i6;
                    this.e = i2;
                    this.f = (byte) 5;
                    r561Var.b(th31Var2, this);
                    return d9nVar;
                }
            }
            hm5.M(obj);
        } else {
            i5 = this.e;
            i3 = this.d;
            it2 = this.c;
            arrayList = (ArrayList) this.b;
            hm5.M(obj);
            if (z2) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(i8);
            }
            i4 = i5;
            while (it2.hasNext()) {
                next = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i8) {
                        this.g = r561Var;
                        this.b = arrayList;
                        this.c = it2;
                        this.d = i3;
                        this.e = i4;
                        this.f = (byte) 1;
                        r561Var.b(arrayList, this);
                        return d9nVar;
                    }
                }
            }
            if (!arrayList.isEmpty() && (z || arrayList.size() == i8)) {
                this.g = null;
                this.b = null;
                this.c = null;
                this.d = i3;
                this.e = i4;
                this.f = (byte) 2;
                r561Var.b(arrayList, this);
                return d9nVar;
            }
        }
        return rih1.a;
    }
}
