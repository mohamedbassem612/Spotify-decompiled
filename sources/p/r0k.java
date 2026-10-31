package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r0k extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s0k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0k(s0k s0kVar, byte b) {
        super(1);
        this.a = b;
        this.b = s0kVar;
    }

    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.a;
        int i = 0;
        s0k s0kVar = this.b;
        switch (b) {
            case 0:
                return new s460(2, 1006, s0kVar.a.getString(2131954177, ((f1k) obj).a), (String) null, (String) null, (String) null, false);
            case 1:
                a1k a1kVar = (a1k) obj;
                Context context = s0kVar.a;
                List list = a1kVar.b;
                z = list.size() >= 10;
                String str = a1kVar.a;
                String string = context.getString(2131954174);
                String string2 = z ? context.getString(2131954178) : null;
                String str2 = a1kVar.a;
                hvl1 hvl1Var = new hvl1(string, 210, (String) null, string2, false, z ? "spotify:list:artist-music-videos:".concat(ihc1.V0(str2, ':', str2)) : null);
                List listD1 = o7h.d1(list, 10);
                ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
                for (Object obj2 : listD1) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str3 = (String) obj2;
                    arrayList.add(new ggi0(f4i1.c(i, "video-preview-composer-page-"), f4i1.c(i, "video-preview-composer-page-"), str3, str3));
                    i = i2;
                }
                return new hgi0("video-preview-composer-page", "video-preview-composer-page", hvl1Var, arrayList, false, str, 48);
            case 2:
                Context context2 = s0kVar.a;
                return new h2d0(context2.getString(2131954178), context2.getString(2131954178), f4i1.e(((c1k) obj).a, ":releases"));
            case 3:
                Context context3 = s0kVar.a;
                return new s460(2, 994, context3.getString(2131954176), (String) null, context3.getString(2131954178), f4i1.e(((d1k) obj).a, ":releases"), false);
            case 4:
                g1k g1kVar = (g1k) obj;
                Context context4 = s0kVar.a;
                List list2 = g1kVar.c;
                z = list2.size() >= 10;
                String str4 = g1kVar.a;
                String string3 = context4.getString(2131954179, g1kVar.b);
                String string4 = z ? context4.getString(2131954178) : null;
                String str5 = g1kVar.a;
                hvl1 hvl1Var2 = new hvl1(string3, 210, (String) null, string4, false, z ? "spotify:list:artist-music-videos:unmapped-".concat(ihc1.V0(str5, ':', str5)) : null);
                List listD2 = o7h.d1(list2, 10);
                ArrayList arrayList2 = new ArrayList(q7h.U(listD2, 10));
                for (Object obj3 : listD2) {
                    int i3 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str6 = (String) obj3;
                    arrayList2.add(new ggi0(f4i1.c(i, "unmapped-video-preview-composer-page-"), f4i1.c(i, "unmapped-video-preview-composer-page-"), str6, str6));
                    i = i3;
                }
                return new hgi0("unmapped-video-preview-composer-page", "unmapped-video-preview-composer-page", hvl1Var2, arrayList2, false, str4, 48);
            case 5:
                Context context5 = s0kVar.a;
                return new h2d0(context5.getString(2131954178), context5.getString(2131954178), f4i1.e(((i1k) obj).a, ":works"));
            case 6:
                Context context6 = s0kVar.a;
                return new s460(2, 994, context6.getString(2131954180), (String) null, context6.getString(2131954178), f4i1.e(((j1k) obj).a, ":works"), false);
            case 7:
                return new s460(2, 1006, s0kVar.a.getString(2131954173), (String) null, (String) null, (String) null, false);
            case 8:
                return new s460(2, 1006, s0kVar.a.getString(2131954172), (String) null, (String) null, (String) null, false);
            default:
                return new s460(2, 1006, s0kVar.a.getString(2131954175), (String) null, (String) null, (String) null, false);
        }
    }
}
