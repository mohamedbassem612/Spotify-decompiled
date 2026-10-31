package p;

import android.net.Uri;
import androidx.compose.ui.geometry.Offset;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class usj extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usj(iu30 iu30Var, kun kunVar) {
        super(1);
        this.a = (byte) 28;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        stn vtnVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new hpm1(((Number) obj).intValue()));
                return rih1Var;
            case 1:
                iu30Var.invoke(new utm1(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 2:
                iu30Var.invoke(u1n1.a);
                return rih1Var;
            case 3:
                iu30Var.invoke(Float.valueOf(Float.intBitsToFloat((int) (((elb0) obj).O(0L) & 4294967295L))));
                return rih1Var;
            case 4:
                iu30Var.invoke(Float.valueOf(((Number) obj).floatValue() * 0.3f));
                return rih1Var;
            case 5:
                iu30Var.invoke(Float.valueOf((((Number) obj).floatValue() * 0.7f) + 0.3f));
                return rih1Var;
            case 6:
                iu30Var.invoke(Boolean.TRUE);
                return rih1Var;
            case 7:
                iu30Var.invoke(Boolean.FALSE);
                return rih1Var;
            case 8:
                iu30Var.invoke(new g8k((String) obj));
                return rih1Var;
            case 9:
                iu30Var.invoke(new w8k((String) obj));
                return rih1Var;
            case 10:
                iu30Var.invoke(hbk.a);
                return rih1Var;
            case 11:
                iu30Var.invoke(Integer.valueOf((int) (((yr80) obj).a >> 32)));
                return rih1Var;
            case 12:
                iu30Var.invoke((rek) obj);
                return rih1Var;
            case 13:
                ((qtr) obj).b(new lu(iu30Var, (lnm) null, (byte) 15));
                return rih1Var;
            case 14:
                iu30Var.invoke((vlk) obj);
                return rih1Var;
            case 15:
                iu30Var.invoke(new gnk((fbh0) obj));
                return rih1Var;
            case 16:
                iu30Var.invoke(new jnk((fbh0) obj));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                iu30Var.invoke(new bwk((qel) obj));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    iu30Var.invoke(new vvk(uri));
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                iu30Var.invoke(new jel((String) obj));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                iu30Var.invoke(new jel((String) obj));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                iu30Var.invoke(new t0m((String) obj));
                return rih1Var;
            case 22:
                iu30Var.invoke(new k2m((String) obj));
                return rih1Var;
            case 23:
                iu30Var.invoke(new i2m((k620) obj));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                iu30Var.invoke((vcm) obj);
                return rih1Var;
            case 25:
                iu30Var.invoke((fem) obj);
                return rih1Var;
            case 26:
                long j = ((Offset) obj).a;
                iu30Var.invoke(tnh0.a);
                return rih1Var;
            case 27:
                iu30Var.invoke(qnh0.a);
                return rih1Var;
            case 28:
                ysn ysnVar = (atn) obj;
                if (ysnVar instanceof wsn) {
                    vtnVar = stn.a;
                } else {
                    if (ysnVar instanceof xsn) {
                        throw null;
                    }
                    if (!(ysnVar instanceof ysn)) {
                        if (ysnVar instanceof zsn) {
                            throw null;
                        }
                        eg.o();
                        return null;
                    }
                    vtnVar = new vtn(ysnVar.a);
                }
                iu30Var.invoke(vtnVar);
                return rih1Var;
            default:
                nyn nynVar = (nyn) obj;
                if (nynVar.equals(lyn.a)) {
                    iu30Var.invoke(syn.a);
                } else {
                    if (!nynVar.equals(myn.a)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(tyn.a);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ usj(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }
}
