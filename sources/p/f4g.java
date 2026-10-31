package p;

import androidx.compose.ui.geometry.Offset;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f4g extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4g(ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj) {
        srk srkVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                return new qr80(((long) ((((int) (((yr80) ven0Var.getValue()).a >> 32)) / 2) - (((wat) obj).i0(48.0f) / 2))) << 32);
            case 1:
                wat watVar = (wat) obj;
                return new qr80((((long) ((((int) (((yr80) ven0Var.getValue()).a & 4294967295L)) / 2) - watVar.i0(12.0f))) & 4294967295L) | (((long) ((((int) (((yr80) ven0Var.getValue()).a >> 32)) / 2) - watVar.i0(24.0f))) << 32));
            case 2:
                kaa0.j(((elb0) obj).E(0L), ven0Var);
                return rih1Var;
            case 3:
                ven0Var.setValue((y9e1) obj);
                return rih1Var;
            case 4:
                ven0Var.setValue((y9e1) obj);
                return rih1Var;
            case 5:
                ven0Var.setValue((y9e1) obj);
                return rih1Var;
            case 6:
                qr80 qr80Var = (qr80) ven0Var.getValue();
                return new qr80(qr80Var != null ? qr80Var.a : 0L);
            case 7:
                kaa0.j(((elb0) obj).E(0L), ven0Var);
                return rih1Var;
            case 8:
                kaa0.j(((elb0) obj).E(0L), ven0Var);
                return rih1Var;
            case 9:
                long j = ((Offset) obj).a;
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 10:
                ven0Var.setValue(Boolean.valueOf(((y9e1) obj).d()));
                return rih1Var;
            case 11:
                ven0Var.setValue((y9e1) obj);
                return rih1Var;
            case 12:
                if (((Number) obj).intValue() >= 10) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                return rih1Var;
            case 13:
                oq70 oq70Var = ((li7) obj).b.a;
                ven0Var.setValue((oq70Var.getWidth() == -1 || oq70Var.getHeight() == -1) ? new mmr0(1, 1) : new mmr0(Integer.valueOf(oq70Var.getWidth()), Integer.valueOf(oq70Var.getHeight())));
                return rih1Var;
            case 14:
                oq70 oq70Var2 = ((li7) obj).b.a;
                ven0Var.setValue(oq70Var2.getWidth() != -1 ? new mmr0(Integer.valueOf(oq70Var2.getWidth()), Integer.valueOf(oq70Var2.getHeight())) : new mmr0(1, 1));
                return rih1Var;
            case 15:
                ((iu30) ven0Var.getValue()).invoke((hne0) obj);
                return rih1Var;
            case 16:
                ((iu30) ven0Var.getValue()).invoke((dov0) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ven0Var.setValue(Boolean.valueOf(((wz20) obj).b()));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ven0Var.setValue(bool);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                iu30 iu30Var = (iu30) ven0Var.getValue();
                int iOrdinal = ((bi00) obj).ordinal();
                if (iOrdinal == 0) {
                    srkVar = srk.b;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    srkVar = srk.a;
                }
                iu30Var.invoke(srkVar);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new ij6(ven0Var, (byte) 2);
            case 22:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 23:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ven0Var.setValue(bool2);
                return rih1Var;
            case 25:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 26:
                b261.n((e261) obj, (String) ven0Var.getValue());
                return rih1Var;
            case 27:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 28:
                yr80 yr80Var = (yr80) obj;
                long j2 = yr80Var.a;
                ven0Var.setValue(yr80Var);
                return rih1Var;
            default:
                long j3 = ((Offset) obj).a;
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
        }
    }
}
