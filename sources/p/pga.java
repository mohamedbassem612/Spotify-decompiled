package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pga extends a8d1 implements vu30 {
    public final /* synthetic */ sga N0;
    public final /* synthetic */ vga O0;
    public final /* synthetic */ kpa P0;
    public final /* synthetic */ jpa Q0;
    public final /* synthetic */ kpa R0;
    public final /* synthetic */ gha X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ jpa Z;
    public AtomicInteger a;
    public AtomicInteger b;
    public List c;
    public List d;
    public List e;
    public ArrayList f;
    public int g;
    public int h;
    public byte i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pga(gha ghaVar, long j, jpa jpaVar, sga sgaVar, vga vgaVar, kpa kpaVar, jpa jpaVar2, kpa kpaVar2, lnm lnmVar) {
        super(2, lnmVar);
        this.X = ghaVar;
        this.Y = j;
        this.Z = jpaVar;
        this.N0 = sgaVar;
        this.O0 = vgaVar;
        this.P0 = kpaVar;
        this.Q0 = jpaVar2;
        this.R0 = kpaVar2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        pga pgaVar = new pga(this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, this.R0, lnmVar);
        pgaVar.t = obj;
        return pgaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        long j;
        opa opaVar;
        ArrayList arrayList2;
        int i;
        pga pgaVar;
        ArrayList arrayList3;
        byte b;
        ArrayList arrayList4;
        int i2;
        d9n d9nVar;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        List list;
        List list2;
        List list3;
        List list4;
        AtomicInteger atomicInteger3;
        pga pgaVar2 = this;
        jpa jpaVar = pgaVar2.Z;
        long j2 = jpaVar.c;
        opa opaVar2 = jpaVar.b;
        gha ghaVar = pgaVar2.X;
        ArrayList arrayList5 = ghaVar.b;
        ArrayList arrayList6 = ghaVar.a;
        c9n c9nVar = (c9n) pgaVar2.t;
        byte b2 = pgaVar2.i;
        d9n d9nVar2 = d9n.a;
        if (b2 != 0) {
            if (b2 == 1) {
                int i3 = pgaVar2.h;
                int i4 = pgaVar2.g;
                ArrayList arrayList7 = pgaVar2.f;
                List list5 = pgaVar2.e;
                List list6 = pgaVar2.d;
                list3 = pgaVar2.c;
                atomicInteger2 = pgaVar2.b;
                AtomicInteger atomicInteger4 = pgaVar2.a;
                hm5.M(obj);
                j = j2;
                opaVar = opaVar2;
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                i2 = i3;
                arrayList3 = arrayList7;
                list2 = list5;
                d9nVar = d9nVar2;
                b = 2;
                pgaVar = pgaVar2;
                atomicInteger = atomicInteger4;
                arrayList4 = null;
                i = i4;
                list = list6;
            } else {
                if (b2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = pgaVar2.e;
                list = pgaVar2.d;
                list4 = pgaVar2.c;
                atomicInteger3 = pgaVar2.b;
                atomicInteger = pgaVar2.a;
                hm5.M(obj);
                j = j2;
                opaVar = opaVar2;
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                pgaVar = pgaVar2;
                arrayList4 = null;
            }
            int i5 = atomicInteger.get();
            int size = arrayList2.size();
            int i6 = atomicInteger3.get();
            int size2 = arrayList.size();
            if (0.0f <= 1.0f || 1.0f > 1.0f) {
                hhg1.n("overallProgress must be between 0.0 and 1.0");
                return arrayList4;
            }
            if (i5 < 0) {
                hhg1.n("videosCompleted must be non-negative");
                return arrayList4;
            }
            if (size < 0) {
                hhg1.n("videosTotal must be non-negative");
                return arrayList4;
            }
            if (i5 > size) {
                hhg1.n("videosCompleted cannot exceed videosTotal");
                return arrayList4;
            }
            if (i6 < 0) {
                hhg1.n("imagesCompleted must be non-negative");
                return arrayList4;
            }
            if (size2 < 0) {
                hhg1.n("imagesTotal must be non-negative");
                return arrayList4;
            }
            if (i6 > size2) {
                hhg1.n("imagesCompleted cannot exceed imagesTotal");
                return arrayList4;
            }
            ppa ppaVar = (ppa) opaVar.h.get(Long.valueOf(j));
            if (ppaVar != null) {
                ppaVar.b((long) (1.0f * 100.0f), j);
            }
            list4.getClass();
            List listL1 = o7h.l1(list4);
            list.getClass();
            List listL2 = o7h.l1(list);
            list2.getClass();
            return new hha(pgaVar.Y, listL1, listL2, o7h.l1(list2));
        }
        hm5.M(obj);
        if (arrayList6.isEmpty() && arrayList5.isEmpty()) {
            z6x z6xVar = z6x.a;
            return new hha(pgaVar2.Y, z6xVar, z6xVar, z6xVar);
        }
        c9n c9nVar2 = c9nVar;
        AtomicInteger atomicInteger5 = new AtomicInteger(0);
        AtomicInteger atomicInteger6 = new AtomicInteger(0);
        int size3 = arrayList5.size() + arrayList6.size();
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        List listSynchronizedList2 = Collections.synchronizedList(new ArrayList());
        List listSynchronizedList3 = Collections.synchronizedList(new ArrayList());
        int size4 = arrayList6.size();
        int size5 = arrayList5.size();
        if (0.0f > 0.0f || 0.0f > 1.0f) {
            hhg1.n("overallProgress must be between 0.0 and 1.0");
            return null;
        }
        if (size4 < 0) {
            hhg1.n("videosTotal must be non-negative");
            return null;
        }
        if (size4 < 0) {
            hhg1.n("videosCompleted cannot exceed videosTotal");
            return null;
        }
        if (size5 < 0) {
            hhg1.n("imagesTotal must be non-negative");
            return null;
        }
        if (size5 < 0) {
            hhg1.n("imagesCompleted cannot exceed imagesTotal");
            return null;
        }
        ppa ppaVar2 = (ppa) opaVar2.h.get(Long.valueOf(j2));
        if (ppaVar2 != null) {
            ppaVar2.b((long) (0.0f * 100.0f), j2);
        }
        ArrayList arrayList8 = ghaVar.a;
        ArrayList arrayList9 = new ArrayList(q7h.U(arrayList8, 10));
        Iterator it = arrayList8.iterator();
        ArrayList arrayList10 = arrayList6;
        int i7 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            kpa kpaVar = pgaVar2.R0;
            jpa jpaVar2 = pgaVar2.Q0;
            ArrayList arrayList11 = arrayList9;
            kpa kpaVar2 = pgaVar2.P0;
            arrayList = arrayList5;
            vga vgaVar = pgaVar2.O0;
            j = j2;
            sga sgaVar = pgaVar2.N0;
            if (!zHasNext) {
                opaVar = opaVar2;
                arrayList2 = arrayList10;
                c9n c9nVar3 = c9nVar2;
                List list7 = listSynchronizedList;
                i = size3;
                List list8 = listSynchronizedList3;
                ArrayList arrayList12 = arrayList11;
                byte b3 = 2;
                ArrayList arrayList13 = null;
                int size6 = arrayList2.size();
                ArrayList arrayList14 = ghaVar.b;
                ArrayList arrayList15 = new ArrayList(q7h.U(arrayList14, 10));
                int i8 = 0;
                for (Object obj2 : arrayList14) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        p7h.T();
                        throw null;
                    }
                    q8n q8nVar = sgaVar.f;
                    c9n c9nVar4 = c9nVar3;
                    ArrayList arrayList16 = arrayList15;
                    AtomicInteger atomicInteger7 = atomicInteger6;
                    AtomicInteger atomicInteger8 = atomicInteger5;
                    oga ogaVar = new oga(sgaVar, (String) obj2, vgaVar, i8 + size6, atomicInteger7, atomicInteger8, i, jpaVar, ghaVar, kpaVar2, listSynchronizedList2, jpaVar2, this.Y, list8, kpaVar, null, (byte) 0);
                    atomicInteger6 = atomicInteger7;
                    atomicInteger5 = atomicInteger8;
                    arrayList16.add(fn31.q(c9nVar4, q8nVar, 0, ogaVar, 2));
                    c9nVar3 = c9nVar4;
                    b3 = 2;
                    ghaVar = ghaVar;
                    i8 = i9;
                    size6 = size6;
                    arrayList13 = null;
                    arrayList15 = arrayList16;
                    sgaVar = sgaVar;
                    arrayList12 = arrayList12;
                }
                pgaVar = this;
                ArrayList arrayList17 = arrayList12;
                int i10 = size6;
                arrayList3 = arrayList15;
                b = b3;
                arrayList4 = arrayList13;
                pgaVar.t = arrayList4;
                pgaVar.a = atomicInteger5;
                pgaVar.b = atomicInteger6;
                pgaVar.c = list7;
                pgaVar.d = listSynchronizedList2;
                pgaVar.e = list8;
                pgaVar.f = arrayList3;
                pgaVar.g = i;
                i2 = i10;
                pgaVar.h = i2;
                pgaVar.i = (byte) 1;
                d9nVar = d9nVar2;
                if (o1p1.u(arrayList17, pgaVar) != d9nVar) {
                    atomicInteger = atomicInteger5;
                    atomicInteger2 = atomicInteger6;
                    list = listSynchronizedList2;
                    list2 = list8;
                    list3 = list7;
                    break;
                }
                return d9nVar;
            }
            Object next = it.next();
            int i11 = i7 + 1;
            if (i7 < 0) {
                p7h.T();
                throw null;
            }
            List list9 = listSynchronizedList3;
            ArrayList arrayList18 = arrayList10;
            c9n c9nVar5 = c9nVar2;
            int i12 = size3;
            List list10 = listSynchronizedList;
            arrayList11.add(fn31.q(c9nVar5, sgaVar.e, 0, new oga(sgaVar, (String) next, vgaVar, i7, atomicInteger5, atomicInteger6, i12, jpaVar, ghaVar, kpaVar2, list10, jpaVar2, pgaVar2.Y, list9, kpaVar, null, (byte) 1), 2));
            pgaVar2 = this;
            c9nVar2 = c9nVar5;
            arrayList9 = arrayList11;
            size3 = i12;
            listSynchronizedList3 = list9;
            listSynchronizedList = list10;
            i7 = i11;
            arrayList5 = arrayList;
            j2 = j;
            arrayList10 = arrayList18;
            opaVar2 = opaVar2;
        }
        pgaVar.t = arrayList4;
        pgaVar.a = atomicInteger;
        pgaVar.b = atomicInteger2;
        pgaVar.c = list3;
        pgaVar.d = list;
        pgaVar.e = list2;
        pgaVar.f = arrayList4;
        pgaVar.g = i;
        pgaVar.h = i2;
        pgaVar.i = b;
        if (o1p1.u(arrayList3, pgaVar) != d9nVar) {
            list4 = list3;
            atomicInteger3 = atomicInteger2;
            int i13 = atomicInteger.get();
            int size7 = arrayList2.size();
            int i14 = atomicInteger3.get();
            int size8 = arrayList.size();
            if (0.0f <= 1.0f) {
            }
            hhg1.n("overallProgress must be between 0.0 and 1.0");
            return arrayList4;
        }
        return d9nVar;
    }
}
