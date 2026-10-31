package p;

import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.TextStyle;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class toy implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ koy c;

    public /* synthetic */ toy(vr20 vr20Var, xoy xoyVar, koy koyVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = koyVar;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final Object emit(Object obj, lnm lnmVar) {
        soy soyVar;
        voy voyVar;
        OffsetDateTime offsetDateTimePlusMinutes;
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        koy koyVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        doy doyVar = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof soy) {
                    soyVar = (soy) lnmVar;
                    int i = soyVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        soyVar.b = i - Integer.MIN_VALUE;
                    } else {
                        soyVar = new soy(this, lnmVar);
                    }
                } else {
                    soyVar = new soy(this, lnmVar);
                }
                Object obj2 = soyVar.a;
                int i2 = soyVar.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    ioy ioyVarG = xoy.g(koyVar, (k1r) obj, x4m.a, q840.a, ast0.c);
                    soyVar.b = 1;
                    return vr20Var.emit(ioyVarG, soyVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof voy) {
                    voyVar = (voy) lnmVar;
                    int i3 = voyVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        voyVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        voyVar = new voy(this, lnmVar);
                    }
                } else {
                    voyVar = new voy(this, lnmVar);
                }
                Object obj3 = voyVar.a;
                int i4 = voyVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                i1r i1rVar = (k1r) obj;
                boolean z = i1rVar instanceof i1r;
                i1r i1rVar2 = z ? i1rVar : null;
                bqk bqkVar = i1rVar2 != null ? (bqk) i1rVar2.a : null;
                j6k j6kVar = bqkVar != null ? bqkVar.a : null;
                lhe0 lhe0Var = bqkVar != null ? bqkVar.b : null;
                if (j6kVar != null) {
                    k7r k7rVar = j6kVar.c.a;
                    o3r o3rVar = zoy.a;
                    offsetDateTimePlusMinutes = LocalDateTime.parse(k7rVar.a, DateTimeFormatter.ISO_DATE_TIME).atOffset(ZoneOffset.UTC).plusMinutes(k7rVar.b);
                } else {
                    offsetDateTimePlusMinutes = null;
                }
                String str2 = koyVar.a;
                String str3 = j6kVar != null ? j6kVar.b : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                if (lhe0Var != null) {
                    o3r o3rVar2 = zoy.a;
                    rnt rntVar = lhe0Var.b;
                    rnt rntVar2 = rntVar instanceof rnt ? rntVar : null;
                    String str5 = rntVar2 != null ? rntVar2.a : null;
                    String strF = lhe0Var.a;
                    if (str5 != null) {
                        strF = f4i1.f(strF, ", ", str5);
                    }
                    str = strF;
                } else {
                    str = null;
                }
                boolean z2 = !z;
                if (offsetDateTimePlusMinutes != null) {
                    o3r o3rVar3 = zoy.a;
                    doyVar = new doy(offsetDateTimePlusMinutes.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()), String.valueOf(offsetDateTimePlusMinutes.getDayOfMonth()));
                }
                ioy ioyVar = new ioy(str2, str4, str, (String) null, false, z2, x4m.a, q840.a, ast0.c, doyVar);
                voyVar.b = 1;
                return vr20Var.emit(ioyVar, voyVar) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
