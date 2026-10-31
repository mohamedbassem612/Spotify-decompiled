package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fml implements o4h1 {
    public final gml a;
    public final m78 b;
    public final Scheduler c;
    public final Scheduler d;
    public final oi e;
    public Disposable f;

    public fml(gml gmlVar, m78 m78Var, Scheduler scheduler, Scheduler scheduler2, oi oiVar) {
        this.a = gmlVar;
        this.b = m78Var;
        this.c = scheduler;
        this.d = scheduler2;
        this.e = oiVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0139  */
    /* JADX WARN: Code duplicated, block: B:27:0x016d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0172  */
    /* JADX WARN: Code duplicated, block: B:32:0x017d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0185  */
    /* JADX WARN: Code duplicated, block: B:35:0x019a  */
    /* JADX WARN: Code duplicated, block: B:36:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x01da  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0204  */
    /* JADX WARN: Code duplicated, block: B:51:0x0208  */
    /* JADX WARN: Code duplicated, block: B:53:0x020f  */
    /* JADX WARN: Code duplicated, block: B:55:0x021a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0223  */
    /* JADX WARN: Code duplicated, block: B:60:0x022b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0236  */
    /* JADX WARN: Code duplicated, block: B:69:0x0262  */
    /* JADX WARN: Code duplicated, block: B:76:0x0282  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(m78 m78Var) {
        pid0 pid0Var;
        ArrayList arrayList;
        ogf1 ogf1Var;
        bhf1 bhf1Var;
        klc1 klc1Var;
        oid0 oid0Var;
        ag1 ag1Var;
        fg1 fg1Var;
        zo21 zo21Var;
        long j;
        int iFloor;
        int i;
        int i2;
        boolean z;
        sgf1 sgf1Var;
        int i3;
        int i4;
        int iFloor2;
        int i5;
        int i6;
        boolean z2;
        glc1 glc1Var;
        oid0 oid0Var2;
        ngf1 ngf1Var = m78Var.c;
        akm0 akm0Var = m78Var.a;
        long j2 = akm0Var.a;
        gml gmlVar = this.a;
        bml bmlVar = gmlVar.a;
        ArrayList arrayList2 = (ArrayList) bmlVar.g;
        arrayList2.clear();
        bmlVar.e = gmlVar.b;
        bmlVar.f = gmlVar.c;
        tlz0 tlz0Var = m78Var.d;
        fid0 fid0Var = tlz0Var.g;
        String str = tlz0Var.i;
        String str2 = tlz0Var.b;
        String str3 = tlz0Var.a;
        List listSingletonList = m78Var.b;
        if (listSingletonList.isEmpty()) {
            listSingletonList = Collections.singletonList(akm0Var);
        }
        if (listSingletonList.size() > 1) {
            pid0Var = new pid0(((akm0) listSingletonList.get(0)).b, (int) (((akm0) listSingletonList.get(0)).b / 60), s110.m(((akm0) listSingletonList.get(0)).b), s110.m(((akm0) listSingletonList.get(0)).a), Integer.valueOf(s110.m(((akm0) listSingletonList.get(1)).b)), Integer.valueOf(s110.m(((akm0) listSingletonList.get(1)).a)), ((akm0) listSingletonList.get(0)).c, tlz0Var.j, tlz0Var.k, tlz0Var.l);
        } else {
            pid0Var = new pid0(((akm0) listSingletonList.get(0)).b, (int) (((akm0) listSingletonList.get(0)).b / 60), s110.m(((akm0) listSingletonList.get(0)).b), s110.m(((akm0) listSingletonList.get(0)).a), null, null, ((akm0) listSingletonList.get(0)).c, tlz0Var.j, tlz0Var.k, tlz0Var.l);
        }
        pid0 pid0Var2 = pid0Var;
        if (!bmlVar.f || (pid0Var2.h.b.length() <= 0 && pid0Var2.i.b.length() <= 0)) {
            if (!bmlVar.f) {
                arrayList2.add(0, pid0Var2);
            }
            arrayList = ngf1Var.a;
            ogf1Var = ngf1Var.b;
            if (arrayList.isEmpty()) {
                if (str.length() > 0) {
                    oid0Var = new oid0(tlz0Var.i);
                    if (bmlVar.f) {
                        arrayList2.add(1, oid0Var);
                    }
                }
                bhf1Var = tlz0Var.d;
                if (bmlVar.f) {
                    arrayList2.add(1, new dhf1(str3, str2, bmlVar.e, bhf1Var));
                } else if (bhf1Var.b.length() > 0) {
                    arrayList2.add(new dhf1(str3, str2, bmlVar.e, bhf1Var));
                }
                klc1Var = tlz0Var.f;
                if (bmlVar.f && klc1Var.b.length() > 0) {
                    arrayList2.add(new mlc1(bmlVar.e, klc1Var));
                }
            } else {
                j = akm0Var.b;
                ytw0 ytw0Var = jfv.b;
                ngv ngvVar = ngv.g;
                long jK0 = fdg1.k0(1, ngvVar);
                ngv ngvVar2 = ngv.e;
                float fU = jfv.u(jK0, ngvVar2);
                ngv ngvVar3 = ngv.f;
                iFloor = (int) Math.floor((jfv.u(fdg1.k0(29, ngvVar3), ngvVar2) + j2) / fU);
                i = ogf1Var.a;
                i2 = ogf1Var.b;
                if (j2 <= j) {
                    z = true;
                } else {
                    z = false;
                }
                tlz0Var = tlz0Var;
                sgf1Var = tlz0Var.c;
                if (bmlVar.f) {
                    i3 = 29;
                    i4 = 1;
                    arrayList2.add(1, new mhf1(str3, str2, i, i2, iFloor, z, bmlVar.e, sgf1Var));
                } else if (sgf1Var.b.length() > 0) {
                    i3 = 29;
                    i4 = 1;
                    arrayList2.add(new mhf1(str3, str2, i, i2, iFloor, z, bmlVar.e, sgf1Var));
                } else {
                    i3 = 29;
                    i4 = 1;
                }
                iFloor2 = (int) Math.floor((jfv.u(fdg1.k0(i3, ngvVar3), ngvVar2) + j2) / jfv.u(fdg1.k0(i4, ngvVar), ngvVar2));
                i5 = ogf1Var.a;
                i6 = ogf1Var.b;
                if (j2 <= j) {
                    z2 = i4;
                } else {
                    z2 = 0;
                }
                glc1Var = tlz0Var.e;
                if (bmlVar.f && glc1Var.b.length() > 0) {
                    arrayList2.add(new nlc1(i5, i6, iFloor2, z2, bmlVar.e, glc1Var));
                }
                if (str.length() > 0) {
                    oid0Var2 = new oid0(tlz0Var.i);
                    if (bmlVar.f) {
                        arrayList2.add(i4, oid0Var2);
                    }
                }
            }
            ag1Var = tlz0Var.h;
            if (fid0Var.b.length() > 0) {
                String str4 = fid0Var.b;
                zo21Var = new zo21(fid0Var.a, str4, fid0Var.c);
                if (bmlVar.f && str4.length() > 0) {
                    arrayList2.add(zo21Var);
                }
            }
            if (ag1Var.b.length() > 0) {
                fg1Var = new fg1(ag1Var);
                if (bmlVar.f && ag1Var.b.length() > 0) {
                    arrayList2.add(2, fg1Var);
                }
            }
            bmlVar.h();
        }
        arrayList2.add(pid0Var2);
        arrayList = ngf1Var.a;
        ogf1Var = ngf1Var.b;
        if (arrayList.isEmpty()) {
            j = akm0Var.b;
            ytw0 ytw0Var2 = jfv.b;
            ngv ngvVar4 = ngv.g;
            long jK1 = fdg1.k0(1, ngvVar4);
            ngv ngvVar5 = ngv.e;
            float fU2 = jfv.u(jK1, ngvVar5);
            ngv ngvVar6 = ngv.f;
            iFloor = (int) Math.floor((jfv.u(fdg1.k0(29, ngvVar6), ngvVar5) + j2) / fU2);
            i = ogf1Var.a;
            i2 = ogf1Var.b;
            if (j2 <= j) {
                z = true;
            } else {
                z = false;
            }
            tlz0Var = tlz0Var;
            sgf1Var = tlz0Var.c;
            if (bmlVar.f) {
                i3 = 29;
                i4 = 1;
                arrayList2.add(1, new mhf1(str3, str2, i, i2, iFloor, z, bmlVar.e, sgf1Var));
            } else if (sgf1Var.b.length() > 0) {
                i3 = 29;
                i4 = 1;
                arrayList2.add(new mhf1(str3, str2, i, i2, iFloor, z, bmlVar.e, sgf1Var));
            } else {
                i3 = 29;
                i4 = 1;
            }
            iFloor2 = (int) Math.floor((jfv.u(fdg1.k0(i3, ngvVar6), ngvVar5) + j2) / jfv.u(fdg1.k0(i4, ngvVar4), ngvVar5));
            i5 = ogf1Var.a;
            i6 = ogf1Var.b;
            if (j2 <= j) {
                z2 = i4;
            } else {
                z2 = 0;
            }
            glc1Var = tlz0Var.e;
            if (bmlVar.f) {
                arrayList2.add(new nlc1(i5, i6, iFloor2, z2, bmlVar.e, glc1Var));
            }
            if (str.length() > 0) {
                oid0Var2 = new oid0(tlz0Var.i);
                if (bmlVar.f) {
                    arrayList2.add(i4, oid0Var2);
                }
            }
        } else {
            if (str.length() > 0) {
                oid0Var = new oid0(tlz0Var.i);
                if (bmlVar.f) {
                    arrayList2.add(1, oid0Var);
                }
            }
            bhf1Var = tlz0Var.d;
            if (bmlVar.f) {
                arrayList2.add(1, new dhf1(str3, str2, bmlVar.e, bhf1Var));
            } else if (bhf1Var.b.length() > 0) {
                arrayList2.add(new dhf1(str3, str2, bmlVar.e, bhf1Var));
            }
            klc1Var = tlz0Var.f;
            if (bmlVar.f) {
                arrayList2.add(new mlc1(bmlVar.e, klc1Var));
            }
        }
        ag1Var = tlz0Var.h;
        if (fid0Var.b.length() > 0) {
            String str5 = fid0Var.b;
            zo21Var = new zo21(fid0Var.a, str5, fid0Var.c);
            if (bmlVar.f) {
                arrayList2.add(zo21Var);
            }
        }
        if (ag1Var.b.length() > 0) {
            fg1Var = new fg1(ag1Var);
            if (bmlVar.f) {
                arrayList2.add(2, fg1Var);
            }
        }
        bmlVar.h();
    }

    @Override // p.o4h1
    public final void start() {
        this.f = this.e.I().subscribeOn(this.d).observeOn(this.c).subscribe(new yrh(this, (byte) 3));
    }

    @Override // p.o4h1
    public final void stop() {
        Disposable disposable = this.f;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
