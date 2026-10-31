package p;

import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.scrollsita.v1.Section;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qza extends hab0 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qza(byte b, int i, boolean z) {
        super(2);
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0174  */
    public final Object invoke(Object obj, Object obj2) {
        up70 up70VarA;
        String str;
        String str2;
        up70 up70VarA2;
        String str3;
        up70 up70VarA3;
        z6x arrayList;
        goj0 goj0VarA;
        l98 l98Var;
        goj0 goj0VarA2;
        r9v0 r9v0Var;
        String strY0;
        mq70 mq70Var;
        z6x z6xVar;
        mq70 mq70Var2;
        up70 up70VarA4;
        String str4;
        mq70 mq70Var3;
        up70 up70VarA5;
        String str5;
        byte b = this.a;
        vp70 vp70Var = vp70.d;
        nim0 nim0Var = nim0.a;
        vp70 vp70Var2 = vp70.c;
        String str6 = "";
        z6x arrayList2 = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                mza mzaVar = (mza) u890.k((k1r) obj2, (d0r) null, (n4r) null);
                String str7 = ((nza) obj).a;
                jo70 jo70Var = mzaVar.a;
                if (jo70Var != null && (str = jo70Var.a) != null) {
                    str6 = str;
                }
                xkk1 xkk1Var = mzaVar.b;
                if (xkk1Var != null && (up70VarA = xkk1Var.a.a(vp70Var)) != null) {
                    arrayList2 = up70VarA.a.a;
                }
                return new oza(str7, str6, arrayList2);
            case 1:
                xza xzaVar = (xza) obj;
                wza wzaVar = (wza) u890.k((k1r) obj2, (d0r) null, (n4r) null);
                String str8 = xzaVar.a;
                jo70 jo70Var2 = wzaVar.a;
                if (jo70Var2 == null || (str2 = jo70Var2.a) == null) {
                    str2 = "";
                }
                xkk1 xkk1Var2 = wzaVar.c;
                uza uzaVar = new uza(str8, str2, (xkk1Var2 == null || (up70VarA3 = xkk1Var2.a.a(vp70Var)) == null) ? null : up70VarA3.a.a);
                String str9 = xzaVar.b;
                jo70 jo70Var3 = wzaVar.b;
                if (jo70Var3 != null && (str3 = jo70Var3.a) != null) {
                    str6 = str3;
                }
                xkk1 xkk1Var3 = wzaVar.d;
                if (xkk1Var3 != null && (up70VarA2 = xkk1Var3.a.a(vp70Var)) != null) {
                    arrayList2 = up70VarA2.a.a;
                }
                return new yza(uzaVar, new uza(str9, str6, arrayList2), xzaVar.c);
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i9h i9hVar = new i9h(z4p1.g(4288519581L));
                    qim0 qim0VarR = u291.r(nim0Var, 248.0f);
                    q3v q3vVar = new q3v(4.0f);
                    cwl1.f(i9hVar, (String) null, i1p1.q(qim0VarR, new ato(q3vVar, q3vVar, q3vVar, q3vVar)), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, x340Var2, 56, 120);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i9h i9hVar2 = new i9h(z4p1.g(4288519581L));
                    qim0 qim0VarR2 = u291.r(nim0Var, 248.0f);
                    q3v q3vVar2 = new q3v(4.0f);
                    cwl1.f(i9hVar2, (String) null, i1p1.q(qim0VarR2, new ato(q3vVar2, q3vVar2, q3vVar2, q3vVar2)), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, x340Var4, 56, 120);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ryn1.f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                y4e y4eVar = (y4e) obj;
                ioj0 ioj0Var = (ioj0) obj2;
                String str10 = y4eVar.a;
                hoj0 hoj0VarC = ioj0Var.c(r9v0.class, str10);
                if (hoj0VarC == null || (goj0VarA2 = hoj0VarC.a()) == null || (r9v0Var = (r9v0) goj0VarA2.a) == null) {
                    arrayList = null;
                } else {
                    ArrayList<q9v0> arrayList3 = r9v0Var.a;
                    arrayList = new ArrayList(q7h.U(arrayList3, 10));
                    for (q9v0 q9v0Var : arrayList3) {
                        arrayList.add(new v8e(q9v0Var.a, q9v0Var.b));
                    }
                }
                hoj0 hoj0VarC2 = ioj0Var.c(l98.class, str10);
                if (hoj0VarC2 != null && (goj0VarA = hoj0VarC2.a()) != null && (l98Var = (l98) goj0VarA.a) != null) {
                    ArrayList<j98> arrayListJ = pwo1.j(l98Var.a);
                    arrayList2 = new ArrayList(q7h.U(arrayListJ, 10));
                    for (j98 j98Var : arrayListJ) {
                        arrayList2.add(new v8e(j98Var.b, j98Var.a));
                    }
                }
                if (arrayList != null) {
                    arrayList2 = arrayList;
                } else if (arrayList2 == null) {
                    arrayList2 = z6x.a;
                }
                return new z4e(y4eVar.b, arrayList == null ? 1 : 2, arrayList2);
            case 6:
                dee deeVar = (dee) obj;
                return Next.h(new hhm0(deeVar.b, deeVar.c, deeVar.a, deeVar.d, 80));
            case 7:
                dee deeVar2 = (dee) obj;
                return First.b(new hhm0(deeVar2.b, deeVar2.c, deeVar2.a, deeVar2.d, 80));
            case 8:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.i0(1364548580);
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                upo1.c((b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                iro1.g((b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                eso1.a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                zso1.n((b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                zso1.p((b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                return phf.f((ahf) obj);
            case 15:
                ((Number) obj2).intValue();
                yto1.l((b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                yto1.n((b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                buo1.o((b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                hxo1.h((b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                hxo1.k((b0k) obj, czo1.p(7));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                z1p1.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                x2p1.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                o5h.d((b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                p6p1.k((b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                p6p1.n((b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                i1r i1rVar = (k1r) obj2;
                if (!(i1rVar instanceof i1r)) {
                    return new akh();
                }
                yjh yjhVar = (yjh) i1rVar.a;
                jo70 jo70Var4 = yjhVar.a;
                String str11 = jo70Var4.a;
                List list = jo70Var4.d;
                if (list != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str12 = ((ho70) it.next()).a;
                        if (ihc1.y0(str12)) {
                            str12 = null;
                        }
                        if (str12 != null) {
                            arrayList4.add(str12);
                        }
                    }
                    strY0 = o7h.y0(arrayList4, ", ", (String) null, (String) null, (iu30) null, 62);
                    if (ihc1.y0(strY0)) {
                        strY0 = null;
                    }
                } else {
                    strY0 = null;
                }
                xkk1 xkk1Var4 = yjhVar.b;
                if (xkk1Var4 != null && (mq70Var = xkk1Var4.a) != null) {
                    up70 up70VarA6 = mq70Var.a(vp70Var2);
                    if (up70VarA6 == null || (z6xVar = up70VarA6.a.a) == null) {
                        up70 up70VarA7 = mq70Var.a(vp70.b);
                        if (up70VarA7 != null) {
                            arrayList2 = up70VarA7.a.a;
                        }
                    } else {
                        arrayList2 = z6xVar;
                    }
                }
                return new akh(str11, strY0, arrayList2);
            case 26:
                ((Number) obj2).intValue();
                p8p1.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                tek tekVar = (tek) obj;
                sek sekVar = (sek) obj2;
                xkk1 xkk1Var5 = sekVar.d;
                j6k j6kVar = sekVar.a;
                k7r k7rVar = j6kVar.c.a;
                OffsetDateTime offsetDateTimePlusMinutes = LocalDateTime.parse(k7rVar.a, DateTimeFormatter.ISO_DATE_TIME).atOffset(ZoneOffset.UTC).plusMinutes(k7rVar.b);
                lhe0 lhe0Var = sekVar.b;
                rnt rntVar = lhe0Var.b;
                boolean z = rntVar instanceof rnt;
                String strF = lhe0Var.a;
                if (z) {
                    strF = f4i1.f(strF, ", ", rntVar.a);
                }
                String str13 = strF;
                if (xkk1Var5 != null && (mq70Var3 = xkk1Var5.a) != null && (up70VarA5 = mq70Var3.a(vp70Var2)) != null && (str5 = up70VarA5.a.a) != null) {
                    str6 = str5;
                }
                if (tekVar.b == 3 && xkk1Var5 != null && (mq70Var2 = xkk1Var5.b) != null && (up70VarA4 = mq70Var2.a(vp70.e)) != null && (str4 = up70VarA4.a.a) != null) {
                    str6 = str4;
                }
                return new uek(tekVar.a, j6kVar.b, str13, str6, offsetDateTimePlusMinutes, offsetDateTimePlusMinutes.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()), String.valueOf(offsetDateTimePlusMinutes.getDayOfMonth()), sekVar.e, tekVar.b, tekVar.c);
            case 28:
                ngk ngkVar = (ngk) obj;
                mgk mgkVar = (mgk) obj2;
                k7r k7rVar2 = mgkVar.a.c.a;
                OffsetDateTime offsetDateTimePlusMinutes2 = LocalDateTime.parse(k7rVar2.a, DateTimeFormatter.ISO_DATE_TIME).atOffset(ZoneOffset.UTC).plusMinutes(k7rVar2.b);
                lhe0 lhe0Var2 = mgkVar.b;
                rnt rntVar2 = lhe0Var2.b;
                rnt rntVar3 = rntVar2 instanceof rnt ? rntVar2 : null;
                arrayList2 = rntVar3 != null ? rntVar3.a : null;
                return new ogk(arrayList2 == null ? "" : arrayList2, lhe0Var2.a, offsetDateTimePlusMinutes2, mgkVar.c, ngkVar.a);
            default:
                ((Number) obj2).intValue();
                k1u.f((b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qza(int i, byte b) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qza(avl1 avl1Var, byte b) {
        super(2);
        this.a = b;
    }
}
