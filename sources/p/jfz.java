package p;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jfz {
    public final int a;
    public final String b;
    public final String c;
    public final List d;
    public final ArrayList e;
    public final List f;
    public final List g;
    public final boolean h;
    public final crn1 i;

    public jfz(int i, String str, String str2, List list, ArrayList arrayList, List list2, List list3, boolean z, crn1 crn1Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = arrayList;
        this.f = list2;
        this.g = list3;
        this.h = z;
        this.i = crn1Var;
        if (i != 3 || (arrayList.isEmpty() && list.isEmpty() && list2.isEmpty())) {
            if (list2.size() == list3.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
            sb.append(list2.size());
            sb.append(") and javaGenericParameterTypesIfFunction.size (");
            sb.append(list3.size());
            sb.append(") must be equal. For member: '");
            bhn0.f(gvg.k(sb, str, '\''));
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Inconsistent combination of EquatableCallableSignature values. kind: ");
        sb2.append(us71.r(i));
        sb2.append(", kotlinParameterTypes.isEmpty(): ");
        sb2.append(arrayList.isEmpty());
        sb2.append(",typeParameters.isEmpty(): ");
        sb2.append(list.isEmpty());
        sb2.append(", javaParameterTypesIfFunction.isEmpty(): ");
        sb2.append(list2.isEmpty());
        sb2.append(".For member: '");
        bhn0.f(gvg.k(sb2, str, '\''));
        throw null;
    }

    public final boolean equals(Object obj) {
        List list;
        vma0 vma0VarF;
        if (this != obj) {
            if (obj instanceof jfz) {
                jfz jfzVar = (jfz) obj;
                List list2 = jfzVar.d;
                List list3 = jfzVar.f;
                String str = jfzVar.b;
                ArrayList arrayList = jfzVar.e;
                crn1 crn1Var = jfzVar.i;
                crn1 crn1Var2 = this.i;
                boolean zEquals = crn1Var2.equals(crn1Var);
                String str2 = this.b;
                if (!zEquals) {
                    bhn0.f(f4i1.f("Equality modes must be the same for member '", str2, "'. Please recreate signatures on inheritance"));
                    return false;
                }
                int i = jfzVar.a;
                int i2 = this.a;
                if (i2 == i && this.h == jfzVar.h) {
                    ArrayList arrayList2 = this.e;
                    if (arrayList2.size() == arrayList.size()) {
                        if (!crn1Var2.equals(kez.b) || i2 != 1) {
                            boolean z = false;
                            if (!u890.j(str2, str) || (vma0VarF = sh10.f((list = this.d), list2)) == null) {
                                return false;
                            }
                            int size = list.size();
                            int i3 = 0;
                            while (i3 < size) {
                                qma0 qma0Var = (qma0) list.get(i3);
                                qma0 qma0Var2 = (qma0) list2.get(i3);
                                if (qma0Var.getUpperBounds().size() != qma0Var2.getUpperBounds().size()) {
                                    return z;
                                }
                                List<oma0> upperBounds = qma0Var.getUpperBounds();
                                ArrayList arrayList3 = new ArrayList(q7h.U(upperBounds, 10));
                                for (oma0 oma0Var : upperBounds) {
                                    vma0 vma0Var = vma0.b;
                                    oma0 oma0Var2 = vma0VarF.a(1, oma0Var).b;
                                    if (oma0Var2 == null) {
                                        sh10.e(str2);
                                        throw null;
                                    }
                                    arrayList3.add(oma0Var2);
                                }
                                boolean z2 = z;
                                ArrayList<mmr0> arrayListV1 = o7h.v1(o7h.a1(arrayList3, new rh10(str2, z2 ? (byte) 1 : (byte) 0)), o7h.a1(qma0Var2.getUpperBounds(), new rh10(str, z2 ? (byte) 1 : (byte) 0)));
                                if (!arrayListV1.isEmpty()) {
                                    for (mmr0 mmr0Var : arrayListV1) {
                                        oma0 oma0Var3 = (oma0) mmr0Var.a;
                                        oma0 oma0Var4 = (oma0) mmr0Var.b;
                                        if (!m5n1.K(oma0Var3, oma0Var4) || !m5n1.K(oma0Var4, oma0Var3)) {
                                            return false;
                                        }
                                    }
                                }
                                i3++;
                                z = false;
                            }
                            int size2 = arrayList2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                oma0 oma0Var5 = (oma0) arrayList2.get(i4);
                                vma0 vma0Var2 = vma0.b;
                                oma0 oma0Var6 = vma0VarF.a(1, oma0Var5).b;
                                if (oma0Var6 == null) {
                                    sh10.e(str2);
                                    throw null;
                                }
                                oma0 oma0Var7 = (oma0) arrayList.get(i4);
                                if (!m5n1.K(oma0Var6, oma0Var7) || !m5n1.K(oma0Var7, oma0Var6)) {
                                    return false;
                                }
                            }
                        } else if (u890.j(this.c, jfzVar.c)) {
                            List list4 = this.f;
                            if (list4.size() == list3.size()) {
                                if (list4.size() != arrayList2.size()) {
                                    StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
                                    sb.append(list4.size());
                                    sb.append(") and kotlinParameterTypes.size (");
                                    sb.append(arrayList2.size());
                                    sb.append(") must be equal for member '");
                                    bhn0.f(gvg.k(sb, str2, '\''));
                                    return false;
                                }
                                int size3 = list4.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    Type type = (Type) this.g.get(i5);
                                    Class cls = (Class) list4.get(i5);
                                    Type type2 = (Type) jfzVar.g.get(i5);
                                    Class cls2 = (Class) list3.get(i5);
                                    TypeVariable typeVariable = type instanceof TypeVariable ? (TypeVariable) type : null;
                                    boolean z3 = (typeVariable != null ? typeVariable.getGenericDeclaration() : null) instanceof Class;
                                    TypeVariable typeVariable2 = type2 instanceof TypeVariable ? (TypeVariable) type2 : null;
                                    boolean z4 = (typeVariable2 != null ? typeVariable2.getGenericDeclaration() : null) instanceof Class;
                                    if (z3 || z4) {
                                        if (cls.isPrimitive() != cls2.isPrimitive()) {
                                            return false;
                                        }
                                        oma0 oma0VarA = sh10.a((oma0) arrayList2.get(i5), str2);
                                        oma0 oma0VarA2 = sh10.a((oma0) arrayList.get(i5), str);
                                        if (!m5n1.K(oma0VarA, oma0VarA2) || !m5n1.K(oma0VarA2, oma0VarA)) {
                                            return false;
                                        }
                                    } else if (!u890.j(cls, cls2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean zEquals = this.i.equals(kez.b);
        int i = this.a;
        boolean z = zEquals && i == 1;
        boolean z2 = this.h;
        ArrayList arrayList = this.e;
        if (!z) {
            if (!z) {
                return Arrays.hashCode(new Object[]{l1d.a(i), Integer.valueOf(arrayList.size()), Boolean.valueOf(z2), this.b});
            }
            eg.o();
            return 0;
        }
        Integer numValueOf = Integer.valueOf(arrayList.size());
        Boolean boolValueOf = Boolean.valueOf(z2);
        String str = this.c;
        if (str == null) {
            str = "";
        }
        return Arrays.hashCode(new Object[]{l1d.a(i), numValueOf, boolValueOf, str});
    }

    public final String toString() {
        return "EquatableCallableSignature(kind=" + us71.r(this.a) + ", name=" + this.b + ", jvmNameIfFunction=" + this.c + ", typeParameters=" + this.d + ", kotlinParameterTypes=" + this.e + ", javaParameterTypesIfFunction=" + this.f + ", javaGenericParameterTypesIfFunction=" + this.g + ", isStatic=" + this.h + ", equalityMode=" + this.i + ')';
    }
}
