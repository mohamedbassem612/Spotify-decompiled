package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class kau implements Update {
    /* JADX WARN: Code duplicated, block: B:113:0x029a  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    public final Next a(Object obj, Object obj2) {
        cbq0 cbq0Var;
        p5j1 p5j1Var;
        cbq0 cbq0Var2;
        p5j1 p5j1Var2;
        int i;
        List list;
        HashSet hashSet;
        boolean z;
        String str;
        qau qauVarA;
        qau qauVarA2;
        int i2;
        int iIntValue;
        String strO;
        qau qauVarA3 = (qau) obj;
        r9u r9uVar = (gau) obj2;
        boolean z2 = qauVarA3.t;
        k9u k9uVar = qauVarA3.h;
        Boolean bool = qauVarA3.f;
        boolean z3 = qauVarA3.O0;
        Integer num = qauVarA3.a;
        s9l1 s9l1Var = qauVarA3.g;
        abu abuVar = qauVarA3.N0;
        if (r9uVar instanceof t9u) {
            s9l1 s9l1Var2 = ((t9u) r9uVar).a;
            wt91 wt91Var = s9l1Var2.g;
            List list2 = s9l1Var2.b;
            qau qauVarA4 = qau.a(qauVarA3, null, null, null, false, false, null, s9l1Var2, null, false, false, false, false, null, false, false, wt91Var != null ? new pau(s9l1Var != null ? s9l1Var.b.size() : 0, wt91Var) : null, null, false, 982967);
            HashSet hashSetA = Effects.a(new d9u[0]);
            if (abuVar == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            hashSetA.add(zp8.a(abuVar, s9l1Var2));
            hashSetA.add(new n8u(false));
            hashSetA.add(new o8u(zp8.f(num != null ? num.intValue() : 0, list2)));
            if (s9l1Var == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            List list3 = s9l1Var.b;
            int iL = p7h.L(list3);
            if (num != null && num.intValue() == iL && list2.size() > list3.size()) {
                hashSetA.add(new i8u(num.intValue() + 1));
            }
            return Next.i(qauVarA4, hashSetA);
        }
        if (r9uVar instanceof w9u) {
            s9l1 s9l1Var3 = ((w9u) r9uVar).a;
            qau qauVarA5 = qau.a(qauVarA3, zp8.d(qauVarA3.c, s9l1Var3), null, null, false, false, null, s9l1Var3, null, false, false, false, false, null, false, false, null, null, false, 1048494);
            HashSet hashSetA2 = Effects.a(new d9u[0]);
            if (abuVar == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            hashSetA2.add(zp8.a(abuVar, s9l1Var3));
            hashSetA2.add(new p8u(false));
            return Next.i(qauVarA5, hashSetA2);
        }
        int i3 = -1;
        if (r9uVar instanceof aau) {
            int i4 = ((aau) r9uVar).a;
            if (s9l1Var == null) {
                return Next.j();
            }
            List<z0i> list4 = s9l1Var.b;
            HashSet hashSetA3 = Effects.a(new d9u[0]);
            if (num != null && (iIntValue = num.intValue()) != i4) {
                String str2 = qauVarA3.R0;
                int i5 = 0;
                for (z0i z0iVar : list4) {
                    if (z0iVar instanceof w8l1) {
                        w8l1 w8l1Var = (w8l1) z0iVar;
                        strO = w8l1Var.getItemId();
                        if (strO == null) {
                            strO = w8l1Var.getUri();
                            if (strO == null) {
                                strO = "";
                            }
                        } else {
                            if (strO.length() <= 0) {
                                strO = null;
                            }
                            if (strO == null) {
                                strO = w8l1Var.getUri();
                                if (strO == null) {
                                    strO = "";
                                }
                            }
                        }
                    } else {
                        strO = rc11.a.b(z0iVar.getClass()).o();
                        if (strO == null) {
                            hhg1.n("Required value was null.");
                            return null;
                        }
                    }
                    if (strO.equals(str2)) {
                        i3 = i5;
                        break;
                    }
                    i5++;
                }
                int iIntValue2 = iIntValue - Integer.valueOf(i3).intValue();
                if (i4 > iIntValue) {
                    hashSetA3.add(new x8u(new v5h1(iIntValue2, (z0i) list4.get(iIntValue))));
                } else {
                    hashSetA3.add(new x8u(new w5h1(iIntValue2, (z0i) list4.get(iIntValue))));
                }
                hashSetA3.add(r8u.a);
            }
            if (num == null || i4 != num.intValue()) {
                Integer numValueOf = Integer.valueOf(i4 + 1);
                if (i4 >= p7h.L(list4)) {
                    numValueOf = null;
                }
                hashSetA3.add(new h8u(numValueOf, i4));
                hashSetA3.add(new o8u(zp8.f(i4, list4)));
            }
            dlr0 dlr0Var = s9l1Var.c;
            if ((dlr0Var != null ? dlr0Var.b : null) == null || qauVarA3.d) {
                i = i4;
                list = list4;
                hashSet = hashSetA3;
                z = z3;
                if (dlr0Var != null) {
                    str = dlr0Var.a;
                } else {
                    str = null;
                }
                if (str != null || qauVarA3.e || i - 1 > 0) {
                    qauVarA = qauVarA3;
                } else {
                    if (abuVar == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    String str3 = dlr0Var != null ? dlr0Var.a : null;
                    if (str3 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    hashSet.add(new k8u(abuVar, str3, true));
                    hashSet.add(new p8u(true));
                    qauVarA2 = qau.a(qauVarA3, null, null, null, false, true, null, null, null, false, false, false, false, null, false, false, null, null, false, 1048431);
                    qauVarA = qauVarA2;
                }
            } else {
                if (i4 < (s9l1Var != null ? s9l1Var.b.size() : 0) - 2) {
                    i = i4;
                    list = list4;
                    hashSet = hashSetA3;
                    z = z3;
                    if (dlr0Var != null) {
                        str = dlr0Var.a;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                    }
                    qauVarA = qauVarA3;
                } else {
                    if (abuVar == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    String str4 = dlr0Var != null ? dlr0Var.b : null;
                    if (str4 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    hashSetA3.add(new j8u(abuVar, str4, true));
                    hashSetA3.add(new n8u(true));
                    hashSetA3.add(new m8u(false));
                    z = z3;
                    i = i4;
                    hashSet = hashSetA3;
                    list = list4;
                    qauVarA2 = qau.a(qauVarA3, null, null, null, true, false, null, null, null, false, false, false, false, null, false, false, null, null, false, 1048439);
                }
                qauVarA = qauVarA2;
            }
            pau pauVar = qauVarA3.Q0;
            if (pauVar != null) {
                i2 = i;
                if (i2 == pauVar.a) {
                    hashSet.add(new u8u(pauVar.b));
                    qauVarA = qau.a(qauVarA, null, null, null, false, false, null, null, null, false, false, false, false, null, false, false, null, null, false, 983039);
                }
            } else {
                i2 = i;
            }
            qau qauVarA6 = qauVarA;
            if (!z && !qauVarA3.T0) {
                qauVarA6 = qau.a(qauVarA6, null, null, null, false, false, null, null, null, false, false, false, false, null, true, false, null, null, false, 1032191);
                hashSet.add(new c9u());
            }
            return Next.i(qau.a(qauVarA6, Integer.valueOf(i2), null, zp8.e((z0i) list.get(i2)), false, false, null, null, null, false, false, false, false, null, false, false, null, null, false, 1048568), hashSet);
        }
        if (r9uVar instanceof q9u) {
            int i6 = ((q9u) r9uVar).a;
            HashSet hashSetA4 = Effects.a(new d9u[0]);
            hashSetA4.add(new t8u(zp8.h(qauVarA3, i6)));
            hashSetA4.add(new z8u(zp8.c(qauVarA3, i6)));
            return Next.a(hashSetA4);
        }
        if (r9uVar instanceof p9u) {
            boolean z4 = ((p9u) r9uVar).a;
            if (!z4 && qauVarA3.P0) {
                return Next.j();
            }
            if (bool == null) {
                qau qauVarA7 = qau.a(qauVarA3, null, null, null, false, false, Boolean.valueOf(z4), null, null, false, false, false, false, null, false, false, null, null, false, 1048543);
                return z4 ? Next.i(qau.a(qauVarA7, null, null, null, false, false, null, null, null, false, false, false, false, null, false, true, null, null, false, 1015807), Effects.a(new y8u[]{new y8u(false)})) : Next.h(qauVarA7);
            }
            if (!z3) {
                return Next.h(qau.a(qauVarA3, null, null, null, false, false, Boolean.valueOf(z4), null, null, false, false, false, false, null, false, false, null, null, false, 1015775));
            }
            if (!z4) {
                return Next.j();
            }
            if (abuVar != null) {
                return Next.a(Effects.a(new g8u[]{new g8u(abuVar, false)}));
            }
            hhg1.n("Required value was null.");
            return null;
        }
        if (r9uVar instanceof o9u) {
            if (abuVar != null) {
                return Next.a(Effects.a(new g8u[]{new g8u(abuVar, false)}));
            }
            hhg1.n("Required value was null.");
            return null;
        }
        if (r9uVar instanceof n9u) {
            if (!((n9u) r9uVar).a || k9uVar == null) {
                return Next.j();
            }
            if (k9uVar instanceof i9u) {
                qau qauVarA8 = qau.a(qauVarA3, null, null, null, true, false, null, null, null, false, false, false, false, null, false, false, null, null, false, 1048439);
                if (abuVar != null) {
                    return Next.i(qauVarA8, Effects.a(new d9u[]{new j8u(abuVar, ((i9u) k9uVar).a, false), new m8u(false)}));
                }
                hhg1.n("Required value was null.");
                return null;
            }
            if (!(k9uVar instanceof j9u)) {
                eg.o();
                return null;
            }
            qau qauVarA9 = qau.a(qauVarA3, null, null, null, false, true, null, null, null, false, false, false, false, null, false, false, null, null, false, 1048431);
            if (abuVar != null) {
                return Next.i(qauVarA9, Effects.a(new k8u[]{new k8u(abuVar, ((j9u) k9uVar).a, false)}));
            }
            hhg1.n("Required value was null.");
            return null;
        }
        if (r9uVar instanceof r9u) {
            k9u k9uVar2 = r9uVar.a;
            if (k9uVar2 instanceof i9u) {
                return Next.i(qau.a(qauVarA3, null, null, null, false, false, null, null, (i9u) k9uVar2, false, false, false, false, null, false, false, null, null, false, 1048439), Effects.a(new m8u[]{new m8u(true)}));
            }
            if (k9uVar2 instanceof j9u) {
                return Next.h(qau.a(qauVarA3, null, null, null, false, false, null, null, (j9u) k9uVar2, false, false, false, false, null, false, false, null, null, false, 1048431));
            }
            eg.o();
            return null;
        }
        if (r9uVar instanceof v9u) {
            v9u v9uVar = (v9u) r9uVar;
            long j = v9uVar.b;
            long j2 = j != 0 ? (v9uVar.c - j) / 60000 : 0L;
            HashSet hashSetA5 = Effects.a(new d9u[0]);
            boolean z5 = v9uVar.a;
            if (z5 && j2 > 15) {
                if (abuVar != null) {
                    hashSetA5.add(new g8u(abuVar, true));
                    return Next.i(qauVarA3, hashSetA5);
                }
                hhg1.n("Required value was null.");
                return null;
            }
            if (!z5) {
                return !z5 ? Next.h(qau.a(qauVarA3, null, null, null, false, false, null, null, null, false, false, false, false, null, false, false, null, null, false, 1048319)) : Next.j();
            }
            if (j != 0) {
                hashSetA5.add(f8u.a);
            }
            if (!qauVarA3.i) {
                if (num != null) {
                    hashSetA5.add(new h8u(null, num.intValue()));
                }
                qauVarA3 = qau.a(qauVarA3, null, null, null, false, false, null, null, null, true, false, false, false, null, false, false, null, null, false, 1048319);
            }
            return !hashSetA5.isEmpty() ? Next.i(qauVarA3, hashSetA5) : Next.j();
        }
        if (r9uVar instanceof cau) {
            boolean z6 = ((cau) r9uVar).a;
            return Next.h(qau.a(qauVarA3, null, null, null, false, false, null, null, null, false, false, (z6 || ((s9l1Var == null || (cbq0Var2 = s9l1Var.f) == null || (p5j1Var2 = cbq0Var2.a) == null) ? false : p5j1Var2.c)) && !qauVarA3.Z, z6, null, false, false, null, null, false, 1045503));
        }
        if (r9uVar instanceof u9u) {
            boolean z7 = qauVarA3.Y;
            if (s9l1Var != null && (cbq0Var = s9l1Var.f) != null && (p5j1Var = cbq0Var.a) != null) {
                boolean z8 = p5j1Var.c;
            }
            qau qauVarA10 = qau.a(qauVarA3, null, null, null, false, false, null, null, null, false, false, false, false, null, false, false, null, null, false, 1043455);
            return qauVarA3.X ? Next.i(qauVarA10, Effects.a(new q8u[]{new q8u()})) : Next.h(qauVarA10);
        }
        if (r9uVar instanceof m9u) {
            if (bool != null && bool.booleanValue()) {
                return Next.a(zp8.b(new y8u(true)));
            }
            if (abuVar != null) {
                return Next.a(zp8.b(new g8u(abuVar, false), new o8u(z6x.a), new x8u(u5h1.b)));
            }
            hhg1.n("Required value was null.");
            return null;
        }
        if (r9uVar instanceof dau) {
            return z2 ? Next.i(qauVarA3, Effects.a(new b9u[]{new b9u(false)})) : Next.j();
        }
        if (r9uVar instanceof fau) {
            return Next.h(qau.a(qauVarA3, null, null, null, false, false, null, null, null, false, false, false, false, null, ((fau) r9uVar).a instanceof aal1, false, null, null, false, 507903));
        }
        if (r9uVar instanceof s9u) {
            return Next.h(qau.a(qauVarA3, null, null, null, false, false, null, null, null, false, ((s9u) r9uVar).a, false, false, null, false, false, null, null, false, 1048063));
        }
        if (r9uVar instanceof bau) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new c9u());
            if (!u890.j(bool, Boolean.TRUE)) {
                return Next.a(linkedHashSet);
            }
            linkedHashSet.add(new y8u(false));
            return Next.i(qau.a(qauVarA3, null, null, null, false, false, null, null, null, false, false, false, false, null, false, true, null, null, false, 1015807), linkedHashSet);
        }
        if (r9uVar instanceof eau) {
            return Next.a(Effects.a(new d9u[]{new v8u(zp8.j(qauVarA3), z2), new w8u(z2)}));
        }
        if (r9uVar instanceof l9u) {
            return Next.a(Effects.a(new e8u[]{new e8u(zp8.j(qauVarA3), z3)}));
        }
        if (r9uVar instanceof y9u) {
            String str5 = ((y9u) r9uVar).a;
            if (s9l1Var != null) {
                Integer numD = zp8.d(str5, s9l1Var);
                return (numD == null || numD.intValue() == -1) ? Next.j() : Next.a(Effects.a(new s8u[]{new s8u(numD.intValue())}));
            }
            hhg1.n("Required value was null.");
            return null;
        }
        if (r9uVar instanceof z9u) {
            Integer numValueOf2 = num != null ? Integer.valueOf(num.intValue() + 1) : null;
            if (numValueOf2 != null) {
                if (numValueOf2.intValue() < (s9l1Var != null ? s9l1Var.b.size() : 0)) {
                    return Next.a(Effects.a(new s8u[]{new s8u(numValueOf2.intValue())}));
                }
            }
            return Next.j();
        }
        if (!(r9uVar instanceof x9u)) {
            eg.o();
            return null;
        }
        if (!(k9uVar instanceof i9u)) {
            return Next.j();
        }
        qau qauVarA11 = qau.a(qauVarA3, null, null, null, true, false, null, null, null, false, false, false, false, null, false, false, null, null, false, 1048439);
        if (abuVar != null) {
            return Next.i(qauVarA11, Effects.a(new d9u[]{new j8u(abuVar, ((i9u) k9uVar).a, false), new m8u(false)}));
        }
        hhg1.n("Required value was null.");
        return null;
    }
}
