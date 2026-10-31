package p;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class muk1 {
    public static final u280 a = new u280(3, new int[]{0, 2, 1});
    public static final u280 b = new u280(5, new int[]{0, 2, 1, 3, 4});
    public static final u280 c = new u280(6, new int[]{0, 2, 1, 5, 3, 4});
    public static final u280 d = u280.d(2, 1, 6, 5, 3, 4);
    public static final u280 e = u280.d(2, 1, 7, 5, 6, 3, 4);

    public static hjj0 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zoi1.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                oon1.H("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(wxs0.d(new izr0(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    oon1.I("Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new juk1(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new hjj0(arrayList);
    }
}
