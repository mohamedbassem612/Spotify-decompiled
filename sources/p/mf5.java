package p;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mf5 implements rzc {
    public final Class a;
    public final ArrayList b;
    public final int c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public mf5(Class cls, ArrayList arrayList, int i, int i2, List list) {
        this.a = cls;
        this.b = arrayList;
        this.c = i;
        this.d = list;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List list3 = this.d;
        ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> cls2 = (Class) bb11.c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List list4 = this.d;
        ArrayList arrayList4 = new ArrayList(q7h.U(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == 2 && i2 == 1 && !o7h.J0(this.b, "value").isEmpty()) {
            hhg1.h("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    @Override // p.rzc
    public final List a() {
        return this.e;
    }

    @Override // p.rzc
    public final Member b() {
        return null;
    }

    @Override // p.rzc
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x013a A[LOOP:0: B:5:0x0015->B:52:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x008d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00e2, please report this as an issue */
    @Override // p.rzc
    public final Object call(Object[] objArr) {
        Object obj;
        Class cls;
        tka0 tka0VarB;
        jd11 jd11Var;
        String strO;
        if (w0h1.r(this) != objArr.length) {
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(w0h1.r(this));
            sb.append(" arguments, but ");
            hhg1.n(gvg.j(sb, objArr.length, " were provided."));
            return null;
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i >= length) {
                return bzn1.n(this.a, sqg0.T(o7h.v1(arrayList2, arrayList)), this.d);
            }
            Object array = objArr[i];
            int i3 = i2 + 1;
            ArrayList arrayList3 = this.f;
            if (array == null && this.c == 1) {
                array = this.g.get(i2);
            } else {
                Class cls2 = (Class) arrayList3.get(i2);
                if (!(array instanceof Class)) {
                    if (array instanceof tka0) {
                        array = ((tka0) array).n();
                    } else {
                        if (array instanceof Object[]) {
                            Object[] objArr2 = (Object[]) array;
                            if (!(objArr2 instanceof Class[])) {
                                if (objArr2 instanceof tka0[]) {
                                    wdg[] wdgVarArr = (tka0[]) array;
                                    ArrayList arrayList4 = new ArrayList(wdgVarArr.length);
                                    for (wdg wdgVar : wdgVarArr) {
                                        arrayList4.add(wdgVar.n());
                                    }
                                    obj = null;
                                    array = arrayList4.toArray(new Class[0]);
                                } else {
                                    obj = null;
                                    array = objArr2;
                                }
                            }
                        }
                        if (!cls2.isInstance(array)) {
                            array = obj;
                        }
                        if (array == null) {
                            String str = (String) arrayList2.get(i2);
                            cls = (Class) arrayList3.get(i2);
                            if (u890.j(cls, Class.class)) {
                                jd11Var = rc11.a;
                                tka0VarB = jd11Var.b(tka0.class);
                            } else if (cls.isArray() || !u890.j(cls.getComponentType(), Class.class)) {
                                jd11 jd11Var2 = rc11.a;
                                tka0VarB = jd11Var2.b(cls);
                                jd11Var = jd11Var2;
                            } else {
                                jd11Var = rc11.a;
                                tka0VarB = jd11Var.b(tka0[].class);
                            }
                            if (u890.j(tka0VarB.o(), jd11Var.b(Object[].class).o())) {
                                strO = tka0VarB.o() + '<' + jd11Var.b(((wdg) tka0VarB).n().getComponentType()).o() + '>';
                            } else {
                                strO = tka0VarB.o();
                            }
                            throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + strO);
                        }
                        arrayList.add(array);
                        i++;
                        i2 = i3;
                    }
                    obj = null;
                    if (!cls2.isInstance(array)) {
                        array = obj;
                    }
                    if (array == null) {
                        String str2 = (String) arrayList2.get(i2);
                        cls = (Class) arrayList3.get(i2);
                        if (u890.j(cls, Class.class)) {
                            jd11Var = rc11.a;
                            tka0VarB = jd11Var.b(tka0.class);
                        } else if (cls.isArray()) {
                            jd11 jd11Var3 = rc11.a;
                            tka0VarB = jd11Var3.b(cls);
                            jd11Var = jd11Var3;
                        } else {
                            jd11 jd11Var4 = rc11.a;
                            tka0VarB = jd11Var4.b(cls);
                            jd11Var = jd11Var4;
                        }
                        if (u890.j(tka0VarB.o(), jd11Var.b(Object[].class).o())) {
                            strO = tka0VarB.o() + '<' + jd11Var.b(((wdg) tka0VarB).n().getComponentType()).o() + '>';
                        } else {
                            strO = tka0VarB.o();
                        }
                        throw new IllegalArgumentException("Argument #" + i2 + ' ' + str2 + " is not of the required type " + strO);
                    }
                    arrayList.add(array);
                    i++;
                    i2 = i3;
                }
                array = null;
            }
            if (array == null) {
                String str3 = (String) arrayList2.get(i2);
                cls = (Class) arrayList3.get(i2);
                if (u890.j(cls, Class.class)) {
                    jd11Var = rc11.a;
                    tka0VarB = jd11Var.b(tka0.class);
                } else if (cls.isArray()) {
                    jd11 jd11Var5 = rc11.a;
                    tka0VarB = jd11Var5.b(cls);
                    jd11Var = jd11Var5;
                } else {
                    jd11 jd11Var6 = rc11.a;
                    tka0VarB = jd11Var6.b(cls);
                    jd11Var = jd11Var6;
                }
                if (u890.j(tka0VarB.o(), jd11Var.b(Object[].class).o())) {
                    strO = tka0VarB.o() + '<' + jd11Var.b(((wdg) tka0VarB).n().getComponentType()).o() + '>';
                } else {
                    strO = tka0VarB.o();
                }
                throw new IllegalArgumentException("Argument #" + i2 + ' ' + str3 + " is not of the required type " + strO);
            }
            arrayList.add(array);
            i++;
            i2 = i3;
        }
    }

    @Override // p.rzc
    public final Type getReturnType() {
        return this.a;
    }

    public /* synthetic */ mf5(Class cls, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, i, 2, arrayList2);
    }
}
