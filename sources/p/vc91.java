package p;

import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vc91 implements Consumer {
    public final /* synthetic */ cd91 a;
    public final /* synthetic */ ssw0 b;
    public final /* synthetic */ boolean c;

    public vc91(cd91 cd91Var, ssw0 ssw0Var, boolean z) {
        this.a = cd91Var;
        this.b = ssw0Var;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:143:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0131  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x013a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0152  */
    /* JADX WARN: Code duplicated, block: B:81:0x015c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0161  */
    /* JADX WARN: Code duplicated, block: B:84:0x0165  */
    /* JADX WARN: Code duplicated, block: B:85:0x016a  */
    /* JADX WARN: Code duplicated, block: B:90:0x017b  */
    /* JADX WARN: Code duplicated, block: B:91:0x017d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0187 A[LOOP:4: B:92:0x0181->B:94:0x0187, LOOP_END] */
    public final void accept(Object obj) {
        boolean z;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        Iterator it;
        Object next;
        jn60 jn60Var;
        yz21 yz21VarF;
        uc91 uc91Var;
        ioj0 ioj0Var;
        List listSingletonList;
        qe91 qe91Var = (qe91) obj;
        this.a.e.l(qe91Var);
        qe91Var.getClass();
        List list = qe91Var.a;
        Map map = qe91Var.b;
        boolean z2 = qe91Var.d;
        ssw0 ssw0Var = this.b;
        if (!z2) {
            if (!map.isEmpty()) {
                Collection collectionValues = map.values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it2 = collectionValues.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            td91 td91Var = (td91) it2.next();
                            if (!(td91Var instanceof qd91) && !(td91Var instanceof pd91)) {
                                break;
                            }
                        }
                    }
                }
            }
            if (qe91Var.c()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    ef91 ef91Var = ef91.FEED;
                    if (!zHasNext) {
                        Collection collectionValues2 = map.values();
                        if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                            Iterator it4 = collectionValues2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((td91) it4.next()) instanceof sd91) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        rd91 rd91Var = (td91) map.get(ef91Var);
                        boolean z3 = rd91Var instanceof rd91;
                        if (!z3) {
                            if (rd91Var instanceof od91) {
                                str2 = ((od91) rd91Var).b;
                            } else {
                                str = null;
                            }
                            if (z3) {
                                str3 = rd91Var.c;
                            } else if (rd91Var instanceof od91) {
                                str3 = ((od91) rd91Var).c;
                            } else {
                                str3 = "";
                            }
                            String str4 = str3;
                            Collection<rd91> collectionValues3 = map.values();
                            arrayList = new ArrayList();
                            for (rd91 rd91Var2 : collectionValues3) {
                                if (rd91Var2 instanceof rd91) {
                                    ioj0Var = rd91Var2.e;
                                } else if (rd91Var2 instanceof od91) {
                                    ioj0Var = ((od91) rd91Var2).e;
                                } else {
                                    ioj0Var = null;
                                }
                                if (ioj0Var != null) {
                                    arrayList.add(ioj0Var);
                                }
                            }
                            it = arrayList.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                while (it.hasNext()) {
                                    next = ((ioj0) next).a(((ioj0) it.next()).a, false);
                                }
                            } else {
                                next = null;
                            }
                            ioj0 ioj0Var2 = (ioj0) next;
                            jn60Var = (jn60) o7h.s0(arrayList2);
                            if (jn60Var != null || (yz21VarF = jn60Var.f()) == null) {
                                yz21VarF = yz21.c;
                            }
                            uc91Var = new uc91(arrayList2, z, yz21VarF, str, str4, qe91Var.c, ioj0Var2);
                            break;
                        }
                        str2 = rd91Var.b;
                        str = str2;
                        if (z3) {
                            str3 = rd91Var.c;
                        } else if (rd91Var instanceof od91) {
                            str3 = ((od91) rd91Var).c;
                        } else {
                            str3 = "";
                        }
                        String str5 = str3;
                        Collection<rd91> collectionValues4 = map.values();
                        arrayList = new ArrayList();
                        while (r2.hasNext()) {
                            if (rd91Var2 instanceof rd91) {
                                ioj0Var = rd91Var2.e;
                            } else if (rd91Var2 instanceof od91) {
                                ioj0Var = ((od91) rd91Var2).e;
                            } else {
                                ioj0Var = null;
                            }
                            if (ioj0Var != null) {
                                arrayList.add(ioj0Var);
                            }
                        }
                        it = arrayList.iterator();
                        if (it.hasNext()) {
                            next = null;
                        } else {
                            next = it.next();
                            while (it.hasNext()) {
                                next = ((ioj0) next).a(((ioj0) it.next()).a, false);
                            }
                        }
                        ioj0 ioj0Var3 = (ioj0) next;
                        jn60Var = (jn60) o7h.s0(arrayList2);
                        if (jn60Var != null) {
                            yz21VarF = yz21.c;
                        } else {
                            yz21VarF = yz21.c;
                        }
                        uc91Var = new uc91(arrayList2, z, yz21VarF, str, str5, qe91Var.c, ioj0Var3);
                        break;
                    }
                    ef91 ef91Var2 = (ef91) it3.next();
                    rd91 rd91Var3 = (td91) map.get(ef91Var2);
                    if (rd91Var3 instanceof rd91) {
                        listSingletonList = rd91Var3.a;
                    } else if (rd91Var3 instanceof od91) {
                        listSingletonList = ((od91) rd91Var3).a;
                    } else {
                        boolean z4 = rd91Var3 instanceof sd91;
                        List list2 = z6x.a;
                        if (z4) {
                            listSingletonList = ef91Var2 == ef91.HERO ? list2 : Collections.singletonList(new ve91("slot-placeholder-".concat(ef91Var2.name().toLowerCase(Locale.ROOT)), ef91Var2));
                        } else if (rd91Var3 instanceof qd91) {
                            if (ef91Var2 == ef91Var && this.c) {
                                listSingletonList = Collections.singletonList(new ee91("slot-error-".concat(ef91Var2.name().toLowerCase(Locale.ROOT)), ef91Var2));
                            }
                        } else if (!(rd91Var3 instanceof pd91) && rd91Var3 != null) {
                            eg.o();
                            return;
                        }
                    }
                    r7h.W(listSingletonList, arrayList2);
                }
            } else {
                uc91Var = null;
            }
            if (uc91Var != null) {
                ssw0Var.l(uc91Var);
            }
            if (list.isEmpty()) {
                return;
            }
            Collection<td91> collectionValues5 = map.values();
            if (!(collectionValues5 instanceof Collection) || !collectionValues5.isEmpty()) {
                for (td91 td91Var2 : collectionValues5) {
                    if (!(td91Var2 instanceof od91) && !(td91Var2 instanceof pd91)) {
                        return;
                    }
                }
            }
            ssw0Var.c().H((Throwable) null);
            return;
        }
        ssw0Var.H(new IllegalStateException("All slots failed to load"));
    }
}
