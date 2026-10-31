package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class csb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csb(Map map, s8o0 s8o0Var) {
        super(1);
        this.a = (byte) 4;
        this.b = map;
    }

    public final Object invoke(Object obj) {
        ko90 ko90Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Map map = null;
        Map map2 = this.b;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                return Boolean.valueOf(map2.get((String) entry.getKey()) != ((drb) entry.getValue()));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                return Boolean.valueOf(map2.get((String) entry2.getKey()) != ((drb) entry2.getValue()));
            case 2:
                pze0.m(map2.get((String) obj));
                return null;
            case 3:
                String str = (String) map2.get(ihc1.e1((String) ((mbh0) obj).a().get(1)).toString());
                return str == null ? "" : str;
            case 4:
                cot cotVar = (cot) obj;
                String str2 = cotVar.b;
                switch (str2) {
                    case "LISTENING_ACTIVITY":
                        ko90Var = ko90.e;
                        break;
                    case "LINK":
                        ko90Var = ko90.d;
                        break;
                    case "MDNS":
                        ko90Var = ko90.a;
                        break;
                    case "CONNECT":
                        ko90Var = ko90.b;
                        break;
                    case "SOCIAL_RADAR_NEARBY":
                        ko90Var = ko90.c;
                        break;
                    default:
                        ko90Var = null;
                        break;
                }
                int i = ko90Var == null ? -1 : r8o0.a[ko90Var.ordinal()];
                if (i != -1 && i != 1 && i != 2 && i != 3) {
                    if (i != 4 && i != 5) {
                        eg.o();
                        return null;
                    }
                    map = map2;
                }
                if (map == null) {
                    map = b7x.a;
                }
                return new cot(cotVar.a, str2, sqg0.O(cotVar.c, map));
            case 5:
                s3t0 s3t0Var = (s3t0) obj;
                Object objB = map2.get(s3t0Var);
                if (objB == null) {
                    objB = gio1.b(Boolean.FALSE);
                    map2.put(s3t0Var, objB);
                }
                ((wen0) objB).m((Object) null, Boolean.TRUE);
                return rih1Var;
            case 6:
                s3t0 s3t0Var2 = (s3t0) obj;
                Object objB2 = map2.get(s3t0Var2);
                if (objB2 == null) {
                    objB2 = gio1.b(Boolean.FALSE);
                    map2.put(s3t0Var2, objB2);
                }
                ((wen0) objB2).m((Object) null, Boolean.FALSE);
                return rih1Var;
            default:
                return new xwm0(map2, (byte) 23);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ csb(Map map, byte b) {
        super(1);
        this.a = b;
        this.b = map;
    }
}
