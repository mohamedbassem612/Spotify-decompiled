package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z5z extends hab0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5z(iu30 iu30Var, bf00 bf00Var, int i) {
        super(1);
        this.a = (byte) 3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj) throws Exception {
        Integer num;
        Object next;
        ljj1 jjj1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                String str = ((uv11) obj).a;
                if (str == null || ihc1.y0(str)) {
                    return null;
                }
                return str;
            case 1:
                u7h u7hVar = ((zuc0) obj).p;
                u7h u7hVar2 = u7hVar instanceof k1z ? (k1z) u7hVar : null;
                int iIntValue = (u7hVar2 == null || (num = ((k1z) u7hVar2).i) == null) ? 0 : num.intValue();
                int i = u7hVar2 != null ? ((k1z) u7hVar2).h : 0;
                return Boolean.valueOf(((long) iIntValue) >= 120 || (i > 0 ? ((float) (i - iIntValue)) / ((float) i) : 0.0f) < 0.8f);
            case 2:
                d441 d441VarG1 = ((y341) obj).g1("SELECT 1 FROM EventSequenceNumbers LIMIT 1");
                try {
                    return Integer.valueOf(d441VarG1.f1() ? (int) d441VarG1.getLong(0) : 0);
                } finally {
                    d441VarG1.close();
                }
            case 3:
                int iOrdinal = ((y800) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    throw null;
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                String strH = zx00.h((px00) obj);
                if (strH == null || !z6b1.b(strH) || z6b1.c(strH)) {
                    return null;
                }
                return strH;
            case 5:
                String strH2 = zx00.h((px00) obj);
                if (strH2 != null && z6b1.b(strH2) && z6b1.c(strH2)) {
                    return strH2;
                }
                return null;
            case 6:
                return new Bundle();
            case 7:
                return new cxc0();
            case 8:
                am10 am10Var = (am10) ((Map) obj).get(q1y0.a);
                return am10Var == null ? new yl10("generate", rd.a, new f1i1(e1i1.d)) : am10Var;
            case 9:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 10:
                d441 d441VarG2 = ((y341) obj).g1("UPDATE liked_songs_filter_tags_entity SET isSelected = 0");
                try {
                    d441VarG2.f1();
                    return rih1Var;
                } finally {
                    d441VarG2.close();
                }
            case 11:
                d441 d441VarG3 = ((y341) obj).g1("SELECT id FROM liked_songs_filter_tags_entity");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG3.f1()) {
                        arrayList.add(d441VarG3.P0(0));
                    }
                    d441VarG3.close();
                    return arrayList;
                } catch (Throwable th) {
                    d441VarG3.close();
                    throw th;
                }
            case 12:
                d441 d441VarG4 = ((y341) obj).g1("SELECT * FROM liked_songs_filter_tags_entity");
                try {
                    int iW = y7y0.w(d441VarG4, "id");
                    int iW2 = y7y0.w(d441VarG4, "title");
                    int iW3 = y7y0.w(d441VarG4, "position");
                    int iW4 = y7y0.w(d441VarG4, "isSelected");
                    ArrayList arrayList2 = new ArrayList();
                    while (d441VarG4.f1()) {
                        arrayList2.add(new ye20((int) d441VarG4.getLong(iW3), d441VarG4.P0(iW), d441VarG4.P0(iW2), ((int) d441VarG4.getLong(iW4)) != 0));
                    }
                    d441VarG4.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    d441VarG4.close();
                    throw th2;
                }
            case 13:
                return mno1.h(new mmr0[]{new mmr0("full.content.share.card.state", (Parcelable) obj)});
            case 14:
                return (Parcelable) jhc1.t((Bundle) obj, "full.content.share.card.state", oq30.class);
            case 15:
                return mno1.h(new mmr0[]{new mmr0("share.funcollectible.card.bundle.key", (Parcelable) obj)});
            case 16:
                return (Parcelable) jhc1.t((Bundle) obj, "share.funcollectible.card.bundle.key", au30.class);
            case 17:
                View view = (View) obj;
                view.setTag(2131428351, Integer.valueOf(view.getResources().getDimensionPixelSize(2131167033)));
                return rih1Var;
            case 18:
                return af60.f((ue60) obj);
            case 19:
                d441 d441VarG5 = ((y341) obj).g1("DELETE FROM history");
                try {
                    d441VarG5.f1();
                    return rih1Var;
                } finally {
                    d441VarG5.close();
                }
            case 20:
                return hh60.d1.invoke((jo70) obj);
            case 21:
                io70 io70Var = ((jo70) obj).e;
                if (io70Var == null) {
                    return null;
                }
                String str2 = io70Var.b;
                if (ihc1.y0(str2)) {
                    return null;
                }
                return str2;
            case 22:
                jo70 jo70Var = (jo70) obj;
                io70 io70Var2 = jo70Var.e;
                if (io70Var2 != null) {
                    return io70Var2.b;
                }
                ho70 ho70Var = (ho70) o7h.s0(jo70Var.d);
                if (ho70Var == null) {
                    return null;
                }
                if (ho70Var.b.length() <= 0) {
                    ho70Var = null;
                }
                if (ho70Var != null) {
                    return ho70Var.b;
                }
                return null;
            case 23:
                Iterator it = ((jo70) obj).d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        ho70 ho70Var2 = (ho70) next;
                        if (!nhc1.Z(ho70Var2.b, "spotify:artist:") || ho70Var2.b.length() <= 15) {
                        }
                    } else {
                        next = null;
                    }
                }
                ho70 ho70Var3 = (ho70) next;
                if (ho70Var3 != null) {
                    return ho70Var3.b;
                }
                return null;
            case 24:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 25:
                return new vb80(zb80.a[l1d.C(((yb80) obj).a)] != 1 ? 2 : 1);
            case 26:
                kby kbyVar = ((cxc0) obj).f;
                f7l1 f7l1VarA = kbyVar.x.a(f7l1.class);
                sqe sqeVar = f7l1VarA != null ? f7l1VarA.a : null;
                a7l1 a7l1Var = sqeVar instanceof a7l1 ? (a7l1) sqeVar : null;
                if (a7l1Var == null) {
                    return f7e0.a;
                }
                String str3 = kbyVar.a;
                e7l1 e7l1Var = a7l1Var.e;
                if (e7l1Var.a.length() == 0) {
                    jjj1Var = null;
                } else {
                    int iC = l1d.C(e7l1Var.b);
                    if (iC == 0) {
                        jjj1Var = new jjj1(e7l1Var.c, e7l1Var.d, e7l1Var.a);
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        jjj1Var = new kjj1(e7l1Var.c, e7l1Var.d, e7l1Var.a);
                    }
                }
                String str4 = a7l1Var.g;
                t7l1 t7l1Var = new t7l1(new h8l1("", "", (String) null, str4, a7l1Var.f.a, (k4m) null, (Float) null, (String) null, 996), new s7l1(jjj1Var, "inline-entity-explorer-banner", true));
                String str5 = a7l1Var.d;
                w6l1 w6l1Var = a7l1Var.j;
                return new e7e0(new zf80(str5, a7l1Var.h, a7l1Var.i, str4, new n6k1(new m6k1(t7l1Var, str5, "", (zau0) null, str5, "", "", (String) null, (String) null, w6l1Var != null ? w6l1Var.d : null, 896), false), str3));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return mh80.a;
            case 28:
                return d9b0.a((lm01) obj);
            default:
                return d9b0.a((lm01) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5z(Object obj, byte b) {
        super(1);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5z(int i, byte b) {
        super(i);
        this.a = b;
    }
}
