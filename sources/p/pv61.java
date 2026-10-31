package p;

import com.spotify.localfiles.settings.localfiles.impl.LocalFilesSettingsValueAccessor;
import com.spotify.scrollsita.v1.Section;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pv61 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pv61(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (grt) obj;
            case 1:
                return (h581) obj;
            case 2:
                return (g981) obj;
            case 3:
                return (uy11) obj;
            case 4:
                return (b6u) obj;
            case 5:
                return (ivw0) obj;
            case 6:
                return (ol0) obj;
            case 7:
                return (dao) obj;
            case 8:
                return (j440) obj;
            case 9:
                return (uce0) obj;
            case 10:
                return (LocalFilesSettingsValueAccessor) obj;
            case 11:
                return (yfo0) obj;
            case 12:
                return (bup0) obj;
            case 13:
                return (r1c1) obj;
            case 14:
                return (u5x) obj;
            case 15:
                return (qmk1) obj;
            case 16:
                return new ol0((l451) obj, (byte) 2);
            case 17:
                return new ol0((pv61) obj, (byte) 3);
            case 18:
                return new ol0((pv61) obj, (byte) 4);
            case 19:
                return new ol0((pv61) obj, (byte) 5);
            case 20:
                return new ol0((pv61) obj, (byte) 6);
            case 21:
                return new ol0((pv61) obj, (byte) 7);
            case 22:
                return new ol0((pv61) obj, (byte) 1);
            case 23:
                return new ol0((pv61) obj, (byte) 8);
            case 24:
                return new ol0((pv61) obj, (byte) 9);
            case 25:
                return new ol0((pv61) obj, (byte) 10);
            case 26:
                return new ol0((pv61) obj, (byte) 11);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new ol0((pv61) obj, (byte) 12);
            case 28:
                return new ol0((pv61) obj, (byte) 13);
            default:
                return new ol0((pv61) obj, (byte) 14);
        }
    }
}
