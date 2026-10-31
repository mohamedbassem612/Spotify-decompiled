package p;

import com.spotify.player.model.ContextTrack$Metadata;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sba implements zto0 {
    public final ynb0 a;
    public final ynb0 b;
    public final ynb0 c;
    public final ynb0 d;

    public /* synthetic */ sba(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ynb0Var3;
        this.d = ynb0Var4;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:35:0x0139  */
    /* JADX WARN: Code duplicated, block: B:37:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006d -> B:20:0x0087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008f -> B:20:0x0087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d4 -> B:30:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ef -> B:34:0x0137). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object a(p.ke51 r24, int r25, p.kjo0 r26, p.onm r27) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sba.a(p.ke51, int, p.kjo0, p.onm):java.lang.Object");
    }

    public rba b(LinkedHashMap linkedHashMap) {
        String str = (String) linkedHashMap.get("uri");
        String str2 = (String) linkedHashMap.get("push_context");
        ilo0 ilo0Var = str2 != null ? (ilo0) ((mbf) this.a.get()).a(str2) : null;
        if (str != null && str.length() != 0 && ilo0Var != null && ilo0Var.c != null && ilo0Var.e != null) {
            Object obj = linkedHashMap.get(ContextTrack$Metadata.KEY_TITLE);
            if (obj != null) {
                String str3 = (String) obj;
                Object obj2 = linkedHashMap.get("message");
                if (obj2 == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                String str4 = (String) obj2;
                String str5 = (String) linkedHashMap.get("rich_push");
                klo0 klo0Var = str5 != null ? (klo0) ((mbf) this.b.get()).a(str5) : null;
                String str6 = (String) linkedHashMap.get("communication_notification");
                hlo0 hlo0Var = str6 != null ? (hlo0) ((mbf) this.c.get()).a(str6) : null;
                String str7 = (String) linkedHashMap.get("quickActions");
                jlo0 jlo0Var = str7 != null ? (jlo0) ((mbf) this.d.get()).a(str7) : null;
                String str8 = (String) linkedHashMap.get("sales");
                boolean z = str8 != null ? Boolean.parseBoolean(str8) : false;
                ujo0 ujo0Var = new ujo0(str3, str4, str);
                String str9 = (String) linkedHashMap.get("app_state");
                if (str9 == null) {
                    str9 = "Unknown";
                }
                return new rba(ujo0Var, new ilo0(ilo0Var.c, ilo0Var.d, ilo0Var.e, ilo0Var.f, str9, ilo0Var.h, ilo0Var.i, ilo0Var.j), jlo0Var, klo0Var, hlo0Var, z);
            }
            eg.m("Required value was null.");
        }
        return null;
    }
}
