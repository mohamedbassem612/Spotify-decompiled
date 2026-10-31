package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rml implements sdm {
    public final wml a;
    public final z6c b;
    public final f971 c;
    public final jl21 d;

    public rml(wml wmlVar, z6c z6cVar, f971 f971Var, jl21 jl21Var) {
        this.a = wmlVar;
        this.b = z6cVar;
        this.c = f971Var;
        this.d = jl21Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(xml xmlVar, onm onmVar) {
        qml qmlVar;
        igm igmVar;
        jhm jhmVar;
        if (onmVar instanceof qml) {
            qmlVar = (qml) onmVar;
            int i = qmlVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qmlVar.d = i - Integer.MIN_VALUE;
            } else {
                qmlVar = new qml(this, onmVar);
            }
        } else {
            qmlVar = new qml(this, onmVar);
        }
        Object objB = qmlVar.b;
        int i2 = qmlVar.d;
        if (i2 == 0) {
            hm5.M(objB);
            String str = xmlVar.a;
            qmlVar.a = xmlVar;
            qmlVar.d = 1;
            objB = this.a.b(str, qmlVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xmlVar = qmlVar.a;
            hm5.M(objB);
        }
        sml smlVar = (sml) objB;
        String str2 = smlVar.a;
        String str3 = smlVar.b;
        String str4 = smlVar.c;
        if (ihc1.y0(str2) && ((str3 == null || ihc1.y0(str3)) && (str4 == null || ihc1.y0(str4)))) {
            igmVar = new igm((String) null, (rzn1) null, (String) null, 7);
        } else {
            Uri uri = (str4 == null || ihc1.y0(str4)) ? Uri.EMPTY : Uri.parse(str4);
            String str5 = smlVar.a;
            uri.getClass();
            igmVar = new igm(str5, new wfm(uri, bgm.c), str3);
        }
        qwm qwmVar = smlVar.e;
        if (qwmVar == null) {
            jhmVar = null;
        } else {
            if (!xmlVar.c || smlVar.d != 17) {
                qwmVar = null;
            }
            if (qwmVar != null) {
                String str6 = qwmVar.a;
                jhmVar = new jhm("browse_contributor", nkx.c, (fhm) null, 2131954376, (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(iub.Z, new nb9(str6, (byte) 28)), new oo6(this.b, str6, qwmVar.b, (byte) 24)), 244);
            } else {
                jhmVar = null;
            }
        }
        return new kjm(igmVar, f46.i0(new jhm[]{f971.b(this.c, xmlVar.a, (String) null), jhmVar, jl21.b(this.d, xmlVar.a, xmlVar.b)}), 4);
    }
}
