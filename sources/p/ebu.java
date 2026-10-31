package p;

import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ebu implements jbh0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ebu(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final String description() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return "starts with segments " + ((String[]) obj);
            case 1:
                return "starts with ".concat((String) obj);
            case 2:
                return "intent uri matches ".concat(((ebu) obj).description());
            case 3:
                return "NOT ".concat(((ebu) obj).description());
            case 4:
                return "is route enabled or not";
            case 5:
                return "is enabled";
            case 6:
                return "in types " + ((Set) obj);
            case 7:
                return "of type " + ((blc0) obj);
            case 8:
                return "of URI type " + ((b3i1) obj);
            default:
                return l1d.m("an intent that has a spotify link ", ((jbh0) obj).description());
        }
    }

    public final boolean match(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Uri uri = ((s4b1) obj).a;
                b3i1 pathSegments = uri != null ? uri.getPathSegments() : null;
                if (pathSegments != null) {
                    String[] strArr = (String[]) obj2;
                    if (pathSegments.size() >= strArr.length) {
                        int length = strArr.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            if (u890.j(pathSegments.get(i2), strArr[i])) {
                                i++;
                                i2 = i3;
                            }
                        }
                        return true;
                    }
                }
                return false;
            case 1:
                return nhc1.Y((String) obj, (String) obj2, false);
            case 2:
                String dataString = ((qs31) obj).a.getDataString();
                if (dataString == null) {
                    return false;
                }
                return ((ebu) obj2).match(dataString);
            case 3:
                return !((ebu) obj2).match(obj);
            case 4:
                return ((acr0) obj2).isEnabled();
            case 5:
                return ((Boolean) ((bey0) obj2).get()).booleanValue();
            case 6:
                return ((Set) obj2).contains(((s4b1) obj).c);
            case 7:
                return ((s4b1) obj).c == ((blc0) obj2);
            case 8:
                v5b1 v5b1Var = ((s4b1) obj).d;
                return u890.j(v5b1Var != null ? v5b1Var.getType() : null, (b3i1) obj2);
            default:
                String dataString2 = ((qs31) obj).a.getDataString();
                Set set = s4b1.f;
                return ((jbh0) obj2).match(uic.x(dataString2));
        }
    }
}
