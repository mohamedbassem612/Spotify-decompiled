package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.aipartner.aipartnerapi.proto.Entity;
import com.spotify.aipartner.aipartnerapi.proto.Image;
import com.spotify.aipartner.aipartnerapi.proto.Metadata;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class myy {
    public final aai0 a;
    public final Context b;

    public myy(Context context, aai0 aai0Var) {
        this.b = context;
        this.a = aai0Var;
    }

    public u310 a(fvt0 fvt0Var, String str) {
        Uri uri;
        String str2 = fvt0Var.a;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str2);
        blc0 blc0Var = s4b1VarX.c;
        String strC = fvt0Var.f;
        String str3 = fvt0Var.a;
        if (str3.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str3.equals("spotify:collection:tracks") || str3.equals("spotify:internal:collection:tracks") || (nhc1.Y(str3, "spotify:user:", false) && nhc1.R(str3, ":collection", false))) {
            return b(fvt0Var, Uri.parse("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ"), blc0Var, strC);
        }
        v5b1 v5b1Var = s4b1VarX.d;
        b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
        if (type == wyu0.f) {
            uri = Uri.parse(uic.y(s4b1VarX.h()).z());
            strC = c(fvt0Var, strC);
        } else if (type != nyu0.e) {
            switch (blc0Var.ordinal()) {
                case 30:
                case 44:
                case 171:
                case 173:
                case 860:
                    uri = Uri.parse(str3);
                    strC = fvt0Var.d;
                    break;
                case 33:
                case 62:
                case 195:
                case 283:
                case 342:
                case 646:
                case 752:
                case 753:
                case 754:
                case 755:
                case 757:
                case 900:
                case 901:
                case 929:
                case 966:
                    uri = Uri.parse(str3);
                    break;
                case 166:
                    uri = Uri.parse("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD");
                    break;
                case 196:
                    uri = Uri.parse("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
                    break;
                case 208:
                case 209:
                    String strZ = uic.e(str).z();
                    uri = strZ == null ? Uri.EMPTY : Uri.parse(strZ);
                    break;
                case 844:
                case 926:
                    uri = Uri.parse(str3);
                    break;
                default:
                    uri = Uri.EMPTY;
                    break;
            }
        } else {
            uri = Uri.parse(str3);
            strC = c(fvt0Var, strC);
        }
        return b(fvt0Var, uri, blc0Var, strC);
    }

    public u310 b(fvt0 fvt0Var, Uri uri, blc0 blc0Var, String str) {
        int i;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        Uri uriE;
        Uri uri5 = Uri.EMPTY;
        if (uri == uri5) {
            n57.e("Couldn't create a playable uri from the playlistUri = " + fvt0Var.a + ", linkType = " + blc0Var);
            return null;
        }
        int iOrdinal = blc0Var.ordinal();
        if (iOrdinal != 44) {
            i = iOrdinal != 860 ? 3 : 2;
        } else {
            i = 1;
        }
        String str2 = fvt0Var.g;
        if (str2 != null) {
            Uri uri6 = Uri.parse(str2);
            aai0 aai0Var = this.a;
            Uri uriE2 = aai0Var.e(uri6, i, 3);
            Uri uriE3 = aai0Var.e(uri6, i, 2);
            uri2 = uri6;
            uriE = aai0Var.e(uri6, i, 1);
            uri3 = uriE2;
            uri4 = uriE3;
        } else {
            uri2 = uri5;
            uri3 = uri2;
            uri4 = uri3;
            uriE = uri4;
        }
        String string = uri.toString();
        String str3 = fvt0Var.c;
        String string2 = uri.toString();
        Set set = s4b1.f;
        return new u310(string, (String) null, str3, str, uri2, (Uri) null, uri3, uri4, uriE, uri, Uri.parse(uic.x(string2).y()), 1, false, false, false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, fvt0Var.e, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
    }

    public String c(fvt0 fvt0Var, String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        boolean zIsEmpty = TextUtils.isEmpty(fvt0Var.d);
        Context context = this.b;
        return zIsEmpty ? context.getString(2131960003) : context.getString(2131960004, fvt0Var.d);
    }

    public phh0 d(Entity entity) {
        Uri uriG;
        String strP = entity.q() ? entity.p() : null;
        String name = entity.o().getName();
        Metadata metadataO = entity.o();
        int iP = metadataO.p();
        int i = 0;
        String strY0 = iP != 0 ? iP != 1 ? o7h.y0(metadataO.q(), this.b.getString(2131957354), (String) null, (String) null, lyy.b, 30) : (String) metadataO.q().get(0) : null;
        String strP2 = entity.p();
        if (!entity.q()) {
            strP2 = null;
        }
        Uri uri = strP2 != null ? Uri.parse(strP2) : null;
        Metadata metadataO2 = entity.o();
        int iN = metadataO2.n();
        if (iN != 0) {
            aai0 aai0Var = this.a;
            if (iN != 1) {
                Iterator it = metadataO2.o().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        uriG = aai0Var.g(((Image) metadataO2.o().get(0)).getUrl());
                        break;
                    }
                    Image image = (Image) it.next();
                    if (image.n() == 320) {
                        uriG = aai0Var.g(image.getUrl());
                        break;
                    }
                }
            } else {
                uriG = aai0Var.g(((Image) metadataO2.o().get(0)).getUrl());
            }
        } else {
            uriG = Uri.EMPTY;
        }
        Uri uri2 = uriG;
        List listN = entity.n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (AbstractList) listN) {
            if (((cm7) obj) != cm7.UNKNOWN_ATTRIBUTE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((cm7) it2.next()).toString());
        }
        ArrayList<String> arrayList3 = new ArrayList<>(arrayList2);
        Bundle bundle = new Bundle();
        switch (entity.o().getTypeValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 11;
                break;
            case 3:
                i = 10;
                break;
            case 4:
                i = 13;
                break;
            case 5:
                i = 16;
                break;
            case 6:
                i = 3;
                break;
            case 7:
                i = 4;
                break;
            case 8:
                i = 15;
                break;
            case 9:
                i = 2;
                break;
        }
        bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", i);
        Uri uri3 = Uri.parse(entity.o().r());
        if (Uri.EMPTY.equals(uri3)) {
            bundle.remove("com.spotify.music.extra.CONTEXT_SHARE_URL");
        } else {
            bundle.putString("com.spotify.music.extra.CONTEXT_SHARE_URL", uri3.toString());
        }
        bundle.putStringArrayList("com.spotify.music.extra.ATTRIBUTES", arrayList3);
        return new phh0(strP, name, strY0, uri, uri2, bundle, 3);
    }

    public myy(aai0 aai0Var, Context context, agc0 agc0Var, wqg wqgVar) {
        this.a = aai0Var;
        this.b = context;
    }
}
