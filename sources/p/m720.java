package p;

import android.content.Context;
import java.util.AbstractList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m720 {
    public final Context a;

    public m720(Context context) {
        this.a = context;
    }

    public final String a(AbstractList abstractList, sha1 sha1Var) {
        String string;
        int i;
        int i2;
        boolean zIsEmpty = abstractList.isEmpty();
        String string2 = null;
        Context context = this.a;
        if (zIsEmpty) {
            string = context.getString(2131955951);
        } else if (abstractList.size() == 1) {
            pa20 pa20Var = (pa20) o7h.A0(abstractList);
            if (pa20Var instanceof na20) {
                i = 2131955998;
            } else if (pa20Var instanceof ma20) {
                i = 2131955984;
            } else if (pa20Var instanceof ka20) {
                i = 2131955982;
            } else if (pa20Var instanceof oa20) {
                i = 2131955999;
            } else {
                if (!(pa20Var instanceof la20)) {
                    eg.o();
                    return null;
                }
                i = 2131955983;
            }
            string = context.getString(i);
        } else {
            string = context.getString(2131956000, Integer.valueOf(abstractList.size()));
        }
        string.getClass();
        if (sha1Var != null) {
            int iOrdinal = sha1Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 2131962818;
            } else if (iOrdinal == 1) {
                i2 = 2131962816;
            } else if (iOrdinal == 2) {
                i2 = 2131962817;
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                i2 = 2131962815;
            }
            string2 = context.getString(i2);
        }
        return (string2 == null || string2.length() == 0) ? string : f4i1.f(string, " • ", string2);
    }
}
