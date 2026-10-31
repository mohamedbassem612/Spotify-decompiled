package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryResponseHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ap20 implements e6c0 {
    public final evm1 a;
    public static final y5c0 b = new y5c0();
    public static final e5c0 c = new e5c0();
    public static final y4c0 d = new y4c0();
    public static final z5c0 e = new z5c0();
    public static final g5c0 f = new g5c0();
    public static final r5c0 g = new r5c0();
    public static final b5c0 h = new b5c0((List) null, 3);
    public static final q5c0 i = new q5c0();
    public static final f5c0 t = f5c0.b;
    public static final d5c0 X = d5c0.b;
    public static final c5c0 Y = c5c0.b;

    public ap20(evm1 evm1Var) {
        this.a = evm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0229  */
    /* JADX WARN: Code duplicated, block: B:132:0x0233  */
    /* JADX WARN: Code duplicated, block: B:137:0x024c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0258  */
    /* JADX WARN: Code duplicated, block: B:140:0x025b  */
    /* JADX WARN: Code duplicated, block: B:141:0x025e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0261  */
    /* JADX WARN: Code duplicated, block: B:143:0x0264  */
    /* JADX WARN: Code duplicated, block: B:144:0x0267  */
    /* JADX WARN: Code duplicated, block: B:148:0x0270  */
    /* JADX WARN: Code duplicated, block: B:151:0x027a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0284  */
    /* JADX WARN: Code duplicated, block: B:159:0x029d  */
    /* JADX WARN: Code duplicated, block: B:161:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:172:0x02d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x02d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x02da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x02dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x02de  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:245:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:? A[LOOP:10: B:152:0x027e->B:259:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:? A[LOOP:12: B:130:0x022d->B:267:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0246 A[SYNTHETIC] */
    @Override // p.e6c0
    public final List b(boolean z, boolean z2, YourLibraryResponseHeader yourLibraryResponseHeader, List list, List list2) {
        ArrayList arrayList;
        d6c0 d6c0Var;
        d6c0 d6c0Var2;
        Iterator it;
        Iterator it2;
        int iOrdinal;
        d6c0 d6c0Var3;
        Iterator it3;
        Iterator it4;
        d6c0 d6c0Var4;
        ArrayList arrayList2;
        Iterator it5;
        int iOrdinal2;
        d6c0 w5c0Var;
        LinkedHashMap linkedHashMap;
        Collection collectionValues;
        ArrayList arrayList3;
        b5c0 b5c0Var;
        b5c0 b5c0Var2;
        d290 d290VarQ = yourLibraryResponseHeader.n().q();
        d6c0 d6c0Var5 = null;
        if (list2.isEmpty()) {
            b5c0 b5c0Var3 = h;
            if (z) {
                arrayList3 = new ArrayList();
                Iterator it6 = d290VarQ.iterator();
                while (it6.hasNext()) {
                    int iOrdinal3 = ((ksm1) it6.next()).ordinal();
                    if (iOrdinal3 == 7) {
                        b5c0Var2 = b5c0Var3;
                    } else if (iOrdinal3 == 14) {
                        b5c0Var2 = X;
                    } else if (iOrdinal3 == 18) {
                        b5c0Var2 = Y;
                    } else if (iOrdinal3 != 9) {
                        b5c0Var2 = iOrdinal3 != 10 ? null : z4c0.b;
                    } else {
                        b5c0Var2 = a5c0.b;
                    }
                    if (b5c0Var2 != null) {
                        arrayList3.add(b5c0Var2);
                    }
                }
            } else {
                arrayList3 = new ArrayList();
                Iterator it7 = d290VarQ.iterator();
                while (it7.hasNext()) {
                    switch ((ksm1) it7.next()) {
                        case ALBUM:
                            b5c0Var = d;
                            break;
                        case ARTIST:
                            b5c0Var = c;
                            break;
                        case PLAYLIST:
                            b5c0Var = b;
                            break;
                        case SHOW:
                            b5c0Var = e;
                            break;
                        case BOOK:
                            b5c0Var = f;
                            break;
                        case EVENT:
                            b5c0Var = g;
                            break;
                        case AUTHOR:
                            b5c0Var = t;
                            break;
                        case DOWNLOADED:
                            b5c0Var = b5c0Var3;
                            break;
                        default:
                            b5c0Var = null;
                            break;
                    }
                    if (b5c0Var != null) {
                        arrayList3.add(b5c0Var);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it8 = arrayList3.iterator();
                while (it8.hasNext()) {
                    if (!((d6c0) it8.next()).a) {
                        hhg1.n("Failed requirement.");
                        return null;
                    }
                }
            }
            return arrayList3;
        }
        if (z2) {
            bdn0 bdn0Var = new bdn0();
            c0p1.h(list, bdn0Var);
            if (list2.isEmpty()) {
                hhg1.n("Failed requirement.");
                return null;
            }
            List list3 = list2;
            ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList4.add(iro1.q((d6c0) it9.next()));
            }
            ArrayList arrayList5 = new ArrayList(arrayList4);
            p811 p811Var = new p811();
            p811Var.a = bdn0Var;
            for (String str = (String) arrayList5.remove(0); str != null; str = (String) r7h.c0(arrayList5)) {
                bdn0 bdn0Var2 = (bdn0) ((bdn0) p811Var.a).a.get(str);
                if (bdn0Var2 == null) {
                    return c0p1.m(bdn0Var);
                }
                d6c0Var5 = (bdn0) p811Var.a;
                p811Var.a = bdn0Var2;
            }
            if (d6c0Var5 != null && (linkedHashMap = d6c0Var5.a) != null && (collectionValues = linkedHashMap.values()) != null) {
                r7h.Z(collectionValues, new i3(p811Var, (byte) 7), true);
            }
            return c0p1.m(bdn0Var);
        }
        List listM = list;
        boolean zIsEmpty = listM.isEmpty();
        ArrayList arrayList6 = z6x.a;
        if (zIsEmpty) {
            bdn0 bdn0Var3 = new bdn0();
            c0p1.h(arrayList6, bdn0Var3);
            bdn0Var3.a.clear();
            Iterator it10 = list2.iterator();
            bdn0 bdn0Var4 = bdn0Var3;
            while (it10.hasNext()) {
                d6c0 d6c0Var6 = (d6c0) it10.next();
                bdn0 bdn0Var5 = new bdn0();
                bdn0Var4.a.put(iro1.q(d6c0Var6), bdn0Var5);
                bdn0Var4 = bdn0Var5;
            }
            listM = c0p1.m(bdn0Var3);
        }
        List list4 = listM;
        boolean z3 = list2.size() >= this.a.t();
        List list5 = list2;
        HashSet hashSet = new HashSet();
        Iterator it11 = list5.iterator();
        while (it11.hasNext()) {
            hashSet.add(iro1.q((d6c0) it11.next()));
            d6c0Var5 = d6c0Var5;
        }
        d6c0 d6c0Var7 = d6c0Var5;
        if (!z3) {
            boolean z4 = list5 instanceof Collection;
            if (z4 && list5.isEmpty()) {
                d6c0Var2 = i;
                if (z4) {
                    it = list5.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((d6c0) it.next()) instanceof g5c0) {
                                arrayList = new ArrayList();
                                it2 = d290VarQ.iterator();
                                while (it2.hasNext()) {
                                    iOrdinal = ((ksm1) it2.next()).ordinal();
                                    if (iOrdinal != 7) {
                                        switch (iOrdinal) {
                                            case 11:
                                                d6c0Var3 = a6c0.b;
                                                break;
                                            case 12:
                                                d6c0Var3 = u5c0.b;
                                                break;
                                            case 13:
                                                d6c0Var3 = s5c0.b;
                                                break;
                                            default:
                                                d6c0Var3 = d6c0Var7;
                                                break;
                                        }
                                    } else {
                                        d6c0Var3 = d6c0Var2;
                                    }
                                    if (d6c0Var3 != null) {
                                        arrayList.add(d6c0Var3);
                                    }
                                }
                            }
                        } else if (z4) {
                            it3 = list5.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    arrayList2 = new ArrayList();
                                    it5 = d290VarQ.iterator();
                                    while (it5.hasNext()) {
                                        iOrdinal2 = ((ksm1) it5.next()).ordinal();
                                        if (iOrdinal2 != 7) {
                                            w5c0Var = d6c0Var2;
                                        } else if (iOrdinal2 != 14) {
                                            w5c0Var = new w5c0(arrayList6);
                                        } else if (iOrdinal2 != 18) {
                                            w5c0Var = new t5c0(arrayList6);
                                        } else if (iOrdinal2 != 9) {
                                            w5c0Var = new i5c0();
                                        } else if (iOrdinal2 != 10) {
                                            w5c0Var = d6c0Var7;
                                        } else {
                                            w5c0Var = new h5c0(arrayList6);
                                        }
                                        if (w5c0Var != null) {
                                            arrayList2.add(w5c0Var);
                                        }
                                    }
                                    arrayList = arrayList2;
                                } else if (((d6c0) it3.next()) instanceof r5c0) {
                                    arrayList = new ArrayList();
                                    it4 = d290VarQ.iterator();
                                    while (it4.hasNext()) {
                                        switch (((ksm1) it4.next()).ordinal()) {
                                            case 15:
                                                d6c0Var4 = b6c0.b;
                                                break;
                                            case 16:
                                                d6c0Var4 = c6c0.b;
                                                break;
                                            case 17:
                                                d6c0Var4 = x5c0.b;
                                                break;
                                            default:
                                                d6c0Var4 = d6c0Var7;
                                                break;
                                        }
                                        if (d6c0Var4 != null) {
                                            arrayList.add(d6c0Var4);
                                        }
                                    }
                                }
                            }
                        } else {
                            it3 = list5.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    arrayList2 = new ArrayList();
                                    it5 = d290VarQ.iterator();
                                    while (it5.hasNext()) {
                                        iOrdinal2 = ((ksm1) it5.next()).ordinal();
                                        if (iOrdinal2 != 7) {
                                            w5c0Var = d6c0Var2;
                                        } else if (iOrdinal2 != 14) {
                                            w5c0Var = new w5c0(arrayList6);
                                        } else if (iOrdinal2 != 18) {
                                            w5c0Var = new t5c0(arrayList6);
                                        } else if (iOrdinal2 != 9) {
                                            w5c0Var = new i5c0();
                                        } else if (iOrdinal2 != 10) {
                                            w5c0Var = d6c0Var7;
                                        } else {
                                            w5c0Var = new h5c0(arrayList6);
                                        }
                                        if (w5c0Var != null) {
                                            arrayList2.add(w5c0Var);
                                        }
                                    }
                                    arrayList = arrayList2;
                                } else if (((d6c0) it3.next()) instanceof r5c0) {
                                    arrayList = new ArrayList();
                                    it4 = d290VarQ.iterator();
                                    while (it4.hasNext()) {
                                        switch (((ksm1) it4.next()).ordinal()) {
                                            case 15:
                                                d6c0Var4 = b6c0.b;
                                                break;
                                            case 16:
                                                d6c0Var4 = c6c0.b;
                                                break;
                                            case 17:
                                                d6c0Var4 = x5c0.b;
                                                break;
                                            default:
                                                d6c0Var4 = d6c0Var7;
                                                break;
                                        }
                                        if (d6c0Var4 != null) {
                                            arrayList.add(d6c0Var4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    it = list5.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((d6c0) it.next()) instanceof g5c0) {
                                arrayList = new ArrayList();
                                it2 = d290VarQ.iterator();
                                while (it2.hasNext()) {
                                    iOrdinal = ((ksm1) it2.next()).ordinal();
                                    if (iOrdinal != 7) {
                                        switch (iOrdinal) {
                                            case 11:
                                                d6c0Var3 = a6c0.b;
                                                break;
                                            case 12:
                                                d6c0Var3 = u5c0.b;
                                                break;
                                            case 13:
                                                d6c0Var3 = s5c0.b;
                                                break;
                                            default:
                                                d6c0Var3 = d6c0Var7;
                                                break;
                                        }
                                    } else {
                                        d6c0Var3 = d6c0Var2;
                                    }
                                    if (d6c0Var3 != null) {
                                        arrayList.add(d6c0Var3);
                                    }
                                }
                            }
                        } else if (z4) {
                            it3 = list5.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    arrayList2 = new ArrayList();
                                    it5 = d290VarQ.iterator();
                                    while (it5.hasNext()) {
                                        iOrdinal2 = ((ksm1) it5.next()).ordinal();
                                        if (iOrdinal2 != 7) {
                                            w5c0Var = d6c0Var2;
                                        } else if (iOrdinal2 != 14) {
                                            w5c0Var = new w5c0(arrayList6);
                                        } else if (iOrdinal2 != 18) {
                                            w5c0Var = new t5c0(arrayList6);
                                        } else if (iOrdinal2 != 9) {
                                            w5c0Var = new i5c0();
                                        } else if (iOrdinal2 != 10) {
                                            w5c0Var = d6c0Var7;
                                        } else {
                                            w5c0Var = new h5c0(arrayList6);
                                        }
                                        if (w5c0Var != null) {
                                            arrayList2.add(w5c0Var);
                                        }
                                    }
                                    arrayList = arrayList2;
                                } else if (((d6c0) it3.next()) instanceof r5c0) {
                                    arrayList = new ArrayList();
                                    it4 = d290VarQ.iterator();
                                    while (it4.hasNext()) {
                                        switch (((ksm1) it4.next()).ordinal()) {
                                            case 15:
                                                d6c0Var4 = b6c0.b;
                                                break;
                                            case 16:
                                                d6c0Var4 = c6c0.b;
                                                break;
                                            case 17:
                                                d6c0Var4 = x5c0.b;
                                                break;
                                            default:
                                                d6c0Var4 = d6c0Var7;
                                                break;
                                        }
                                        if (d6c0Var4 != null) {
                                            arrayList.add(d6c0Var4);
                                        }
                                    }
                                }
                            }
                        } else {
                            it3 = list5.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    arrayList2 = new ArrayList();
                                    it5 = d290VarQ.iterator();
                                    while (it5.hasNext()) {
                                        iOrdinal2 = ((ksm1) it5.next()).ordinal();
                                        if (iOrdinal2 != 7) {
                                            w5c0Var = d6c0Var2;
                                        } else if (iOrdinal2 != 14) {
                                            w5c0Var = new w5c0(arrayList6);
                                        } else if (iOrdinal2 != 18) {
                                            w5c0Var = new t5c0(arrayList6);
                                        } else if (iOrdinal2 != 9) {
                                            w5c0Var = new i5c0();
                                        } else if (iOrdinal2 != 10) {
                                            w5c0Var = d6c0Var7;
                                        } else {
                                            w5c0Var = new h5c0(arrayList6);
                                        }
                                        if (w5c0Var != null) {
                                            arrayList2.add(w5c0Var);
                                        }
                                    }
                                    arrayList = arrayList2;
                                } else if (((d6c0) it3.next()) instanceof r5c0) {
                                    arrayList = new ArrayList();
                                    it4 = d290VarQ.iterator();
                                    while (it4.hasNext()) {
                                        switch (((ksm1) it4.next()).ordinal()) {
                                            case 15:
                                                d6c0Var4 = b6c0.b;
                                                break;
                                            case 16:
                                                d6c0Var4 = c6c0.b;
                                                break;
                                            case 17:
                                                d6c0Var4 = x5c0.b;
                                                break;
                                            default:
                                                d6c0Var4 = d6c0Var7;
                                                break;
                                        }
                                        if (d6c0Var4 != null) {
                                            arrayList.add(d6c0Var4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                Iterator it12 = list5.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        d6c0Var2 = i;
                        if (z4 || !list5.isEmpty()) {
                            it = list5.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((d6c0) it.next()) instanceof g5c0) {
                                        arrayList = new ArrayList();
                                        it2 = d290VarQ.iterator();
                                        while (it2.hasNext()) {
                                            iOrdinal = ((ksm1) it2.next()).ordinal();
                                            if (iOrdinal != 7) {
                                                switch (iOrdinal) {
                                                    case 11:
                                                        d6c0Var3 = a6c0.b;
                                                        break;
                                                    case 12:
                                                        d6c0Var3 = u5c0.b;
                                                        break;
                                                    case 13:
                                                        d6c0Var3 = s5c0.b;
                                                        break;
                                                    default:
                                                        d6c0Var3 = d6c0Var7;
                                                        break;
                                                }
                                            } else {
                                                d6c0Var3 = d6c0Var2;
                                            }
                                            if (d6c0Var3 != null) {
                                                arrayList.add(d6c0Var3);
                                            }
                                        }
                                    }
                                } else if (z4 || !list5.isEmpty()) {
                                    it3 = list5.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            arrayList2 = new ArrayList();
                                            it5 = d290VarQ.iterator();
                                            while (it5.hasNext()) {
                                                iOrdinal2 = ((ksm1) it5.next()).ordinal();
                                                if (iOrdinal2 != 7) {
                                                    w5c0Var = d6c0Var2;
                                                } else if (iOrdinal2 != 14) {
                                                    w5c0Var = new w5c0(arrayList6);
                                                } else if (iOrdinal2 != 18) {
                                                    w5c0Var = new t5c0(arrayList6);
                                                } else if (iOrdinal2 != 9) {
                                                    w5c0Var = new i5c0();
                                                } else if (iOrdinal2 != 10) {
                                                    w5c0Var = d6c0Var7;
                                                } else {
                                                    w5c0Var = new h5c0(arrayList6);
                                                }
                                                if (w5c0Var != null) {
                                                    arrayList2.add(w5c0Var);
                                                }
                                            }
                                            arrayList = arrayList2;
                                        } else if (((d6c0) it3.next()) instanceof r5c0) {
                                            arrayList = new ArrayList();
                                            it4 = d290VarQ.iterator();
                                            while (it4.hasNext()) {
                                                switch (((ksm1) it4.next()).ordinal()) {
                                                    case 15:
                                                        d6c0Var4 = b6c0.b;
                                                        break;
                                                    case 16:
                                                        d6c0Var4 = c6c0.b;
                                                        break;
                                                    case 17:
                                                        d6c0Var4 = x5c0.b;
                                                        break;
                                                    default:
                                                        d6c0Var4 = d6c0Var7;
                                                        break;
                                                }
                                                if (d6c0Var4 != null) {
                                                    arrayList.add(d6c0Var4);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    arrayList2 = new ArrayList();
                                    it5 = d290VarQ.iterator();
                                    while (it5.hasNext()) {
                                        iOrdinal2 = ((ksm1) it5.next()).ordinal();
                                        if (iOrdinal2 != 7) {
                                            w5c0Var = d6c0Var2;
                                        } else if (iOrdinal2 != 14) {
                                            w5c0Var = new w5c0(arrayList6);
                                        } else if (iOrdinal2 != 18) {
                                            w5c0Var = new t5c0(arrayList6);
                                        } else if (iOrdinal2 != 9) {
                                            w5c0Var = new i5c0();
                                        } else if (iOrdinal2 != 10) {
                                            w5c0Var = d6c0Var7;
                                        } else {
                                            w5c0Var = new h5c0(arrayList6);
                                        }
                                        if (w5c0Var != null) {
                                            arrayList2.add(w5c0Var);
                                        }
                                    }
                                    arrayList = arrayList2;
                                }
                            }
                        } else if (z4) {
                            it3 = list5.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    arrayList2 = new ArrayList();
                                    it5 = d290VarQ.iterator();
                                    while (it5.hasNext()) {
                                        iOrdinal2 = ((ksm1) it5.next()).ordinal();
                                        if (iOrdinal2 != 7) {
                                            w5c0Var = d6c0Var2;
                                        } else if (iOrdinal2 != 14) {
                                            w5c0Var = new w5c0(arrayList6);
                                        } else if (iOrdinal2 != 18) {
                                            w5c0Var = new t5c0(arrayList6);
                                        } else if (iOrdinal2 != 9) {
                                            w5c0Var = new i5c0();
                                        } else if (iOrdinal2 != 10) {
                                            w5c0Var = d6c0Var7;
                                        } else {
                                            w5c0Var = new h5c0(arrayList6);
                                        }
                                        if (w5c0Var != null) {
                                            arrayList2.add(w5c0Var);
                                        }
                                    }
                                    arrayList = arrayList2;
                                } else if (((d6c0) it3.next()) instanceof r5c0) {
                                    arrayList = new ArrayList();
                                    it4 = d290VarQ.iterator();
                                    while (it4.hasNext()) {
                                        switch (((ksm1) it4.next()).ordinal()) {
                                            case 15:
                                                d6c0Var4 = b6c0.b;
                                                break;
                                            case 16:
                                                d6c0Var4 = c6c0.b;
                                                break;
                                            case 17:
                                                d6c0Var4 = x5c0.b;
                                                break;
                                            default:
                                                d6c0Var4 = d6c0Var7;
                                                break;
                                        }
                                        if (d6c0Var4 != null) {
                                            arrayList.add(d6c0Var4);
                                        }
                                    }
                                }
                            }
                        } else {
                            it3 = list5.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    arrayList2 = new ArrayList();
                                    it5 = d290VarQ.iterator();
                                    while (it5.hasNext()) {
                                        iOrdinal2 = ((ksm1) it5.next()).ordinal();
                                        if (iOrdinal2 != 7) {
                                            w5c0Var = d6c0Var2;
                                        } else if (iOrdinal2 != 14) {
                                            w5c0Var = new w5c0(arrayList6);
                                        } else if (iOrdinal2 != 18) {
                                            w5c0Var = new t5c0(arrayList6);
                                        } else if (iOrdinal2 != 9) {
                                            w5c0Var = new i5c0();
                                        } else if (iOrdinal2 != 10) {
                                            w5c0Var = d6c0Var7;
                                        } else {
                                            w5c0Var = new h5c0(arrayList6);
                                        }
                                        if (w5c0Var != null) {
                                            arrayList2.add(w5c0Var);
                                        }
                                    }
                                    arrayList = arrayList2;
                                } else if (((d6c0) it3.next()) instanceof r5c0) {
                                    arrayList = new ArrayList();
                                    it4 = d290VarQ.iterator();
                                    while (it4.hasNext()) {
                                        switch (((ksm1) it4.next()).ordinal()) {
                                            case 15:
                                                d6c0Var4 = b6c0.b;
                                                break;
                                            case 16:
                                                d6c0Var4 = c6c0.b;
                                                break;
                                            case 17:
                                                d6c0Var4 = x5c0.b;
                                                break;
                                            default:
                                                d6c0Var4 = d6c0Var7;
                                                break;
                                        }
                                        if (d6c0Var4 != null) {
                                            arrayList.add(d6c0Var4);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (((d6c0) it12.next()) instanceof b5c0) {
                        arrayList = new ArrayList();
                        Iterator it13 = d290VarQ.iterator();
                        while (it13.hasNext()) {
                            int iOrdinal4 = ((ksm1) it13.next()).ordinal();
                            if (iOrdinal4 == 0) {
                                d6c0Var = k5c0.b;
                            } else if (iOrdinal4 == 1) {
                                d6c0Var = l5c0.b;
                            } else if (iOrdinal4 == 2) {
                                d6c0Var = o5c0.b;
                            } else if (iOrdinal4 != 3) {
                                d6c0Var = iOrdinal4 != 4 ? d6c0Var7 : m5c0.b;
                            } else {
                                d6c0Var = p5c0.b;
                            }
                            if (d6c0Var != null) {
                                arrayList.add(d6c0Var);
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it14 = arrayList.iterator();
                while (it14.hasNext()) {
                    if (((d6c0) it14.next()).a) {
                        hhg1.n("Failed requirement.");
                        return d6c0Var7;
                    }
                }
            }
            arrayList6 = new ArrayList();
            for (Object obj : arrayList) {
                if (!hashSet.contains(iro1.q((d6c0) obj))) {
                    arrayList6.add(obj);
                }
            }
        }
        if (arrayList6.isEmpty()) {
            return list4;
        }
        bdn0 bdn0Var6 = new bdn0();
        c0p1.h(list4, bdn0Var6);
        if (list2.isEmpty()) {
            hhg1.n("Failed requirement.");
            return d6c0Var7;
        }
        if (arrayList6.isEmpty()) {
            hhg1.n("Failed requirement.");
            return d6c0Var7;
        }
        ArrayList arrayList7 = new ArrayList(q7h.U(list5, 10));
        Iterator it15 = list5.iterator();
        while (it15.hasNext()) {
            arrayList7.add(iro1.q((d6c0) it15.next()));
        }
        ArrayList arrayList8 = new ArrayList(arrayList7);
        bdn0 bdn0Var7 = bdn0Var6;
        for (String str2 = (String) arrayList8.remove(0); str2 != null; str2 = (String) r7h.c0(arrayList8)) {
            bdn0Var7 = (bdn0) bdn0Var7.a.get(str2);
            if (bdn0Var7 == null) {
                return c0p1.m(bdn0Var6);
            }
        }
        c0p1.h(arrayList6, bdn0Var7);
        return c0p1.m(bdn0Var6);
    }
}
