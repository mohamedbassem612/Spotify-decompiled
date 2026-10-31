package p;

import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Connection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xj0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj0(hwx0 hwx0Var, ven0 ven0Var) {
        super(1);
        this.a = (byte) 18;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue(new yr80(((elb0) obj).b()));
                return rih1Var;
            case 1:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ven0Var.setValue(bool);
                return rih1Var;
            case 3:
                lsl lslVar = (lsl) obj;
                if (((n61) ven0Var.getValue()).b) {
                    lslVar.s1();
                }
                return rih1Var;
            case 4:
                ((iu30) ven0Var.getValue()).invoke(new sa1((String) obj));
                return rih1Var;
            case 5:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 6:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 7:
                ((iu30) ven0Var.getValue()).invoke((bt1) obj);
                return rih1Var;
            case 8:
                ven0Var.setValue(Integer.valueOf(jch0.U(Float.intBitsToFloat((int) (nho1.A((elb0) obj) & 4294967295L)))));
                return rih1Var;
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ven0Var.setValue(bool2);
                return rih1Var;
            case 10:
                ((iu30) ven0Var.getValue()).invoke((bt1) obj);
                return rih1Var;
            case 11:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ven0Var.setValue(bool3);
                return rih1Var;
            case 12:
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 13:
                ven0Var.setValue(Long.valueOf(((Number) obj).longValue()));
                return rih1Var;
            case 14:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(b3k1.b);
                ven0Var.setValue(videoSurfaceView);
                return videoSurfaceView;
            case 15:
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj;
                if (!u890.j((VideoSurfaceView) ven0Var.getValue(), videoSurfaceView2)) {
                    ven0Var.setValue(videoSurfaceView2);
                }
                return rih1Var;
            case 16:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, (String) ven0Var.getValue());
                b261.t(e261Var, 1);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Function0) ven0Var.getValue()).invoke();
                return Boolean.FALSE;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Function0) ven0Var.getValue()).invoke();
                return Boolean.FALSE;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((iu30) ven0Var.getValue()).invoke(((af5) obj).b);
                return Boolean.TRUE;
            case 22:
                ven0Var.setValue((elb0) obj);
                return rih1Var;
            case 23:
                y9e1 y9e1Var = (y9e1) obj;
                ven0Var.setValue(Boolean.valueOf(y9e1Var.b.b(0) <= ((float) ((int) (4294967295L & y9e1Var.c)))));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                y9e1 y9e1Var2 = (y9e1) obj;
                ven0Var.setValue(Boolean.valueOf(y9e1Var2.b.b(0) <= ((float) ((int) (4294967295L & y9e1Var2.c)))));
                return rih1Var;
            case 25:
                ((kd31) obj).b(((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : 0.0f);
                return rih1Var;
            case 26:
                return new ij6(ven0Var, (byte) 0);
            case 27:
                String str = (String) obj;
                Connection connection = (Connection) ven0Var.getValue();
                if (connection != null) {
                    connection.accept(new fr6(str));
                }
                return rih1Var;
            case 28:
                abc0 abc0Var = (abc0) obj;
                abc0Var.c = new vk1(ven0Var, (lnm) null, (byte) 2);
                abc0Var.a = new vk1(ven0Var, (lnm) null, (byte) 3);
                return rih1Var;
            default:
                ven0Var.setValue((sx7) obj);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj0(ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
    }
}
