package p;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ghm1 implements qhv0 {
    public final Intent a;
    public final String b;
    public final xrc0 c;
    public final iyc0 d;
    public final nfa0 e;
    public final me30 f;
    public final q8n g;

    public ghm1(Intent intent, String str, xrc0 xrc0Var, iyc0 iyc0Var, nfa0 nfa0Var, me30 me30Var, q8n q8nVar) {
        this.a = intent;
        this.b = str;
        this.c = xrc0Var;
        this.d = iyc0Var;
        this.e = nfa0Var;
        this.f = me30Var;
        this.g = q8nVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lnm lnmVar) throws NoWhenBranchMatchedException {
        ehm1 ehm1Var;
        if (lnmVar instanceof ehm1) {
            ehm1Var = (ehm1) lnmVar;
            int i = ehm1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ehm1Var.c = i - Integer.MIN_VALUE;
            } else {
                ehm1Var = new ehm1(this, (onm) lnmVar);
            }
        } else {
            ehm1Var = new ehm1(this, (onm) lnmVar);
        }
        Object objO = ehm1Var.a;
        int i2 = ehm1Var.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                ihm1 ihm1VarV = ton1.v(this.a);
                if (ihm1VarV != null) {
                    h8m1 h8m1Var = new h8m1(this, ihm1VarV, (lnm) null, (byte) 4);
                    ehm1Var.c = 1;
                    objO = rc2.O(4000L, h8m1Var, ehm1Var);
                    if (objO == d9nVar) {
                    }
                    return d9nVar;
                }
                return rih1Var;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    hm5.M(objO);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
            bhm1 bhm1Var = (bhm1) objO;
            int i3 = bhm1Var == null ? -1 : chm1.a[bhm1Var.ordinal()];
            if (i3 == -1) {
                Logger.k("Wrapped sharing: timed out applying incoming lens", new Object[0]);
                return rih1Var;
            }
            if (i3 == 1 || i3 == 2) {
                q8n q8nVar = this.g;
                vbc1 vbc1Var = new vbc1(this, (lnm) null, (byte) 27);
                ehm1Var.c = 2;
                if (fn31.Y(q8nVar, vbc1Var, ehm1Var) == d9nVar) {
                    return d9nVar;
                }
            } else if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.l(e2, "Wrapped sharing: could not apply incoming lens", new Object[0]);
            return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019e  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:117:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:98:0x0197  */
    /* JADX WARN: Code duplicated, block: B:99:0x0199  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, p.ghm1] */
    /* JADX WARN: Type inference failed for: r1v24, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v39 */
    public final Enum b(String str, onm onmVar) throws Exception {
        dhm1 dhm1Var;
        String str2;
        Object next;
        l811 l811Var;
        l811 l811Var2;
        Exception exc;
        String str3;
        String str4;
        l811 l811Var3;
        String str5;
        l811 l811Var4;
        String str6;
        int i;
        String str7;
        boolean zBooleanValue;
        String str8;
        String str9;
        ?? BooleanValue;
        String str10;
        if (onmVar instanceof dhm1) {
            dhm1Var = (dhm1) onmVar;
            int i2 = dhm1Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dhm1Var.i = i2 - Integer.MIN_VALUE;
            } else {
                dhm1Var = new dhm1(this, onmVar);
            }
        } else {
            dhm1Var = new dhm1(this, onmVar);
        }
        dhm1 dhm1Var2 = dhm1Var;
        Object objJ = dhm1Var2.g;
        int i3 = dhm1Var2.i;
        bhm1 bhm1Var = bhm1.c;
        int i4 = 1;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objJ);
            rxc0 rxc0Var = new rxc0(this.b);
            str2 = str;
            dhm1Var2.a = str2;
            dhm1Var2.i = 1;
            objJ = this.c.j(rxc0Var, dhm1Var2);
            if (objJ != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 == 1) {
            str2 = dhm1Var2.a;
            hm5.M(objJ);
        } else {
            if (i3 == 2) {
                int i5 = dhm1Var2.f;
                l811 l811Var5 = dhm1Var2.d;
                l811 l811Var6 = dhm1Var2.c;
                String str11 = dhm1Var2.b;
                str5 = dhm1Var2.a;
                try {
                    hm5.M(objJ);
                    i = i5;
                    l811Var4 = l811Var5;
                    l811Var = l811Var6;
                    str6 = str11;
                    try {
                        l811Var3 = l811Var;
                        str7 = str5;
                        l811Var2 = l811Var4;
                        zBooleanValue = ((Boolean) objJ).booleanValue();
                        if (zBooleanValue || str7 == null) {
                            str4 = str6;
                            BooleanValue = zBooleanValue;
                            if (BooleanValue == 0) {
                                if (!l811Var2.a) {
                                    str7 = null;
                                }
                                if (l811Var3.a) {
                                    str10 = str4;
                                } else {
                                    str10 = null;
                                }
                                dhm1Var2.a = null;
                                dhm1Var2.b = null;
                                dhm1Var2.c = null;
                                dhm1Var2.d = null;
                                dhm1Var2.f = BooleanValue;
                                dhm1Var2.i = 5;
                                if (fn31.Y(geo0.b, new q4m1(str7, str10, (Object) this, (lnm) null, (byte) 9), dhm1Var2) == d9nVar) {
                                    return bhm1Var;
                                }
                            }
                            return bhm1.a;
                        }
                        try {
                            l811Var2.a = true;
                            dhm1Var2.a = str7;
                            dhm1Var2.b = str6;
                            dhm1Var2.c = l811Var3;
                            dhm1Var2.d = l811Var2;
                            dhm1Var2.f = zBooleanValue ? 1 : 0;
                            dhm1Var2.i = 3;
                            objJ = c(str7, dhm1Var2, true);
                            if (objJ != d9nVar) {
                                i4 = zBooleanValue ? 1 : 0;
                                str4 = str6;
                                str3 = str7;
                                l811Var4 = l811Var2;
                                l811Var2 = l811Var4;
                                str7 = str3;
                                BooleanValue = ((Boolean) objJ).booleanValue();
                                if (BooleanValue == 0) {
                                    if (!l811Var2.a) {
                                        str7 = null;
                                    }
                                    if (l811Var3.a) {
                                        str10 = str4;
                                    } else {
                                        str10 = null;
                                    }
                                    dhm1Var2.a = null;
                                    dhm1Var2.b = null;
                                    dhm1Var2.c = null;
                                    dhm1Var2.d = null;
                                    dhm1Var2.f = BooleanValue;
                                    dhm1Var2.i = 5;
                                    if (fn31.Y(geo0.b, new q4m1(str7, str10, (Object) this, (lnm) null, (byte) 9), dhm1Var2) == d9nVar) {
                                        return bhm1Var;
                                    }
                                }
                                return bhm1.a;
                            }
                        } catch (Exception e) {
                            exc = e;
                            i4 = zBooleanValue ? 1 : 0;
                            str4 = str6;
                            str3 = str7;
                            l811Var4 = l811Var2;
                            if (l811Var4.a) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (l811Var3.a) {
                                str9 = str4;
                            } else {
                                str9 = null;
                            }
                            dhm1Var2.a = null;
                            dhm1Var2.b = null;
                            dhm1Var2.c = null;
                            dhm1Var2.d = null;
                            dhm1Var2.e = exc;
                            dhm1Var2.f = i4;
                            dhm1Var2.i = 4;
                            if (fn31.Y(geo0.b, new q4m1(str8, str9, (Object) this, (lnm) null, (byte) 9), dhm1Var2) != d9nVar) {
                                throw exc;
                            }
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        i4 = i;
                        str4 = str6;
                        l811Var3 = l811Var;
                        str3 = str5;
                        if (l811Var4.a) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (l811Var3.a) {
                            str9 = str4;
                        } else {
                            str9 = null;
                        }
                        dhm1Var2.a = null;
                        dhm1Var2.b = null;
                        dhm1Var2.c = null;
                        dhm1Var2.d = null;
                        dhm1Var2.e = exc;
                        dhm1Var2.f = i4;
                        dhm1Var2.i = 4;
                        if (fn31.Y(geo0.b, new q4m1(str8, str9, (Object) this, (lnm) null, (byte) 9), dhm1Var2) != d9nVar) {
                            throw exc;
                        }
                    }
                } catch (Exception e3) {
                    exc = e3;
                    i4 = i5;
                    l811Var4 = l811Var5;
                    l811Var3 = l811Var6;
                    str4 = str11;
                    str3 = str5;
                    if (l811Var4.a) {
                        str8 = str3;
                    } else {
                        str8 = null;
                    }
                    if (l811Var3.a) {
                        str9 = str4;
                    } else {
                        str9 = null;
                    }
                    dhm1Var2.a = null;
                    dhm1Var2.b = null;
                    dhm1Var2.c = null;
                    dhm1Var2.d = null;
                    dhm1Var2.e = exc;
                    dhm1Var2.f = i4;
                    dhm1Var2.i = 4;
                    if (fn31.Y(geo0.b, new q4m1(str8, str9, (Object) this, (lnm) null, (byte) 9), dhm1Var2) != d9nVar) {
                        throw exc;
                    }
                    return d9nVar;
                }
                return d9nVar;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    Exception exc2 = dhm1Var2.e;
                    hm5.M(objJ);
                    throw exc2;
                }
                if (i3 == 5) {
                    hm5.M(objJ);
                    return bhm1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = dhm1Var2.f;
            l811Var4 = dhm1Var2.d;
            l811Var3 = dhm1Var2.c;
            str4 = dhm1Var2.b;
            str3 = dhm1Var2.a;
            try {
                hm5.M(objJ);
                l811Var2 = l811Var4;
                str7 = str3;
                BooleanValue = ((Boolean) objJ).booleanValue();
                if (BooleanValue == 0) {
                    if (!l811Var2.a) {
                        str7 = null;
                    }
                    if (l811Var3.a) {
                        str10 = str4;
                    } else {
                        str10 = null;
                    }
                    dhm1Var2.a = null;
                    dhm1Var2.b = null;
                    dhm1Var2.c = null;
                    dhm1Var2.d = null;
                    dhm1Var2.f = BooleanValue;
                    dhm1Var2.i = 5;
                    if (fn31.Y(geo0.b, new q4m1(str7, str10, (Object) this, (lnm) null, (byte) 9), dhm1Var2) == d9nVar) {
                        return d9nVar;
                    }
                    return bhm1Var;
                }
                return bhm1.a;
            } catch (Exception e4) {
                exc = e4;
                if (l811Var4.a) {
                    str8 = str3;
                } else {
                    str8 = null;
                }
                if (l811Var3.a) {
                    str9 = str4;
                } else {
                    str9 = null;
                }
                dhm1Var2.a = null;
                dhm1Var2.b = null;
                dhm1Var2.c = null;
                dhm1Var2.d = null;
                dhm1Var2.e = exc;
                dhm1Var2.f = i4;
                dhm1Var2.i = 4;
                if (fn31.Y(geo0.b, new q4m1(str8, str9, (Object) this, (lnm) null, (byte) 9), dhm1Var2) != d9nVar) {
                    throw exc;
                }
            }
        }
        oy21 oy21Var = (py21) objJ;
        if (!(oy21Var instanceof oy21)) {
            if (!(oy21Var instanceof ly21)) {
                eg.o();
                return null;
            }
            jy21 jy21Var = ((ly21) oy21Var).a;
            Logger.k("Wrapped sharing: metadata lookup failed (%s): %s", new Object[]{jy21Var.a(), jy21Var.b()});
            return bhm1Var;
        }
        qxc0 qxc0Var = (qxc0) oy21Var.a;
        if (this.f.a(qxc0Var.e) == le30.s1) {
            List list = wb20.a(qxc0Var.X, this.e).b;
            if (!list.isEmpty()) {
                if (str2 != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (!u890.j(((jb20) it.next()).a, str2));
                    }
                }
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((jb20) next).c);
                jb20 jb20Var = (jb20) next;
                String str12 = jb20Var != null ? jb20Var.a : null;
                if (!u890.j(str12, str2)) {
                    l811Var = new l811();
                    l811Var2 = new l811();
                    if (str12 != null) {
                        try {
                            l811Var.a = true;
                            dhm1Var2.a = str2;
                            dhm1Var2.b = str12;
                            dhm1Var2.c = l811Var;
                            dhm1Var2.d = l811Var2;
                            dhm1Var2.f = 1;
                            dhm1Var2.i = 2;
                            objJ = c(str12, dhm1Var2, false);
                            if (objJ != d9nVar) {
                                str5 = str2;
                                l811Var4 = l811Var2;
                                str6 = str12;
                                i = 1;
                                l811Var3 = l811Var;
                                str7 = str5;
                                l811Var2 = l811Var4;
                                zBooleanValue = ((Boolean) objJ).booleanValue();
                                if (zBooleanValue) {
                                }
                                str4 = str6;
                                BooleanValue = zBooleanValue;
                                if (BooleanValue == 0) {
                                    if (!l811Var2.a) {
                                        str7 = null;
                                    }
                                    if (l811Var3.a) {
                                        str10 = str4;
                                    } else {
                                        str10 = null;
                                    }
                                    dhm1Var2.a = null;
                                    dhm1Var2.b = null;
                                    dhm1Var2.c = null;
                                    dhm1Var2.d = null;
                                    dhm1Var2.f = BooleanValue;
                                    dhm1Var2.i = 5;
                                    if (fn31.Y(geo0.b, new q4m1(str7, str10, (Object) this, (lnm) null, (byte) 9), dhm1Var2) == d9nVar) {
                                        return bhm1Var;
                                    }
                                }
                            }
                        } catch (Exception e5) {
                            exc = e5;
                            str3 = str2;
                            str4 = str12;
                            l811Var3 = l811Var;
                            l811Var4 = l811Var2;
                            if (l811Var4.a) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (l811Var3.a) {
                                str9 = str4;
                            } else {
                                str9 = null;
                            }
                            dhm1Var2.a = null;
                            dhm1Var2.b = null;
                            dhm1Var2.c = null;
                            dhm1Var2.d = null;
                            dhm1Var2.e = exc;
                            dhm1Var2.f = i4;
                            dhm1Var2.i = 4;
                            if (fn31.Y(geo0.b, new q4m1(str8, str9, (Object) this, (lnm) null, (byte) 9), dhm1Var2) != d9nVar) {
                                throw exc;
                            }
                            return d9nVar;
                        }
                    } else {
                        str6 = str12;
                        l811Var3 = l811Var;
                        str7 = str2;
                        zBooleanValue = true;
                        if (zBooleanValue) {
                        }
                        str4 = str6;
                        BooleanValue = zBooleanValue;
                        if (BooleanValue == 0) {
                            if (!l811Var2.a) {
                                str7 = null;
                            }
                            if (l811Var3.a) {
                                str10 = str4;
                            } else {
                                str10 = null;
                            }
                            dhm1Var2.a = null;
                            dhm1Var2.b = null;
                            dhm1Var2.c = null;
                            dhm1Var2.d = null;
                            dhm1Var2.f = BooleanValue;
                            dhm1Var2.i = 5;
                            if (fn31.Y(geo0.b, new q4m1(str7, str10, (Object) this, (lnm) null, (byte) 9), dhm1Var2) == d9nVar) {
                                return bhm1Var;
                            }
                        }
                    }
                    return d9nVar;
                }
                return bhm1.a;
            }
        }
        return bhm1.b;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(String str, onm onmVar, boolean z) {
        fhm1 fhm1Var;
        if (onmVar instanceof fhm1) {
            fhm1Var = (fhm1) onmVar;
            int i = fhm1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fhm1Var.c = i - Integer.MIN_VALUE;
            } else {
                fhm1Var = new fhm1(this, onmVar);
            }
        } else {
            fhm1Var = new fhm1(this, onmVar);
        }
        fhm1 fhm1Var2 = fhm1Var;
        Object objP = fhm1Var2.a;
        int i2 = fhm1Var2.c;
        boolean z2 = true;
        if (i2 == 0) {
            hm5.M(objP);
            fhm1Var2.c = 1;
            objP = this.d.p(this.b, str, z, false, fhm1Var2);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        ly21 ly21Var = (py21) objP;
        if (!(ly21Var instanceof oy21)) {
            if (!(ly21Var instanceof ly21)) {
                eg.o();
                return null;
            }
            jy21 jy21Var = ly21Var.a;
            Logger.k("Wrapped sharing: lens update failed (%s): %s", new Object[]{jy21Var.a(), jy21Var.b()});
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
