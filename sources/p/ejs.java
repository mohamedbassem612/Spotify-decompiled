package p;

import android.content.Context;
import android.text.format.DateUtils;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ejs implements iu30 {
    public static final i92 c = new i92((byte) 8);
    public final Context a;
    public final djs b = new djs(this, (byte) 0);

    public ejs(Context context) {
        this.a = context;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        String strSubstring = null;
        if (str.length() >= 2) {
            String strSubstring2 = str.substring(0, 2);
            if (strSubstring2.equals("D:")) {
                String strSubstring3 = str.substring(2);
                DateFormat dateFormat = (DateFormat) c.get();
                Date date = dateFormat != null ? dateFormat.parse(strSubstring3) : null;
                if (date != null) {
                    Context context = this.a;
                    if (context.getResources().getBoolean(2131034141)) {
                        strSubstring = DateUtils.formatDateTime(context, date.getTime(), 65568);
                        strSubstring.getClass();
                    } else {
                        Object obj2 = this.b.get();
                        obj2.getClass();
                        strSubstring = ((DateFormat) obj2).format(date);
                        strSubstring.getClass();
                    }
                }
            } else if (strSubstring2.equals("S:")) {
                strSubstring = str.substring(2);
            }
        }
        return strSubstring == null ? "" : strSubstring;
    }
}
