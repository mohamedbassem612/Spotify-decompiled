package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xak1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qtg b;
    public final /* synthetic */ yak1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xak1(qtg qtgVar, yak1 yak1Var, byte b) {
        super(1);
        this.a = b;
        this.b = qtgVar;
        this.c = yak1Var;
    }

    public final Object invoke(Object obj) {
        FormatType formatType;
        FormatType formatType2;
        FormatType formatType3;
        byte b = this.a;
        boolean z = false;
        Set set = w7x.a;
        yak1 yak1Var = this.c;
        qtg qtgVar = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) obj;
                gmc gmcVar = (gmc) mmr0Var.a;
                y4j0 y4j0Var = (a5j0) mmr0Var.b;
                String str = gmcVar.d;
                mxv0 mxv0Var = (mxv0) qtgVar;
                gmc gmcVar2 = mxv0Var.d;
                if (u890.j(str, gmcVar2.d) && (y4j0Var instanceof y4j0)) {
                    dqu dquVar = yak1Var.a;
                    FormatType formatType4 = mxv0Var.g;
                    LoggingData loggingDataI = yhm0.i(y4j0Var.b);
                    if (loggingDataI == null || (formatType = loggingDataI.getFormatType()) == null) {
                        formatType = FormatType.FORMAT_UNKNOWN;
                    }
                    Set set2 = (Set) ((Map) dquVar.b).get(formatType4);
                    if (set2 != null) {
                        set = set2;
                    }
                    if (set.contains(formatType) && !u890.j(gmcVar2.a, gmcVar.a)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                mmr0 mmr0Var2 = (mmr0) obj;
                gmc gmcVar3 = (gmc) mmr0Var2.a;
                z4j0 z4j0Var = (a5j0) mmr0Var2.b;
                mxv0 mxv0Var2 = (mxv0) qtgVar;
                if (u890.j(gmcVar3.d, mxv0Var2.d.d) && (z4j0Var instanceof z4j0)) {
                    dqu dquVar2 = yak1Var.a;
                    FormatType formatType5 = mxv0Var2.g;
                    LoggingData loggingDataI2 = yhm0.i(z4j0Var.b);
                    if (loggingDataI2 == null || (formatType2 = loggingDataI2.getFormatType()) == null) {
                        formatType2 = FormatType.FORMAT_UNKNOWN;
                    }
                    Set set3 = (Set) ((Map) dquVar2.b).get(formatType5);
                    if (set3 != null) {
                        set = set3;
                    }
                    if (set.contains(formatType2)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                mmr0 mmr0Var3 = (mmr0) obj;
                gmc gmcVar4 = (gmc) mmr0Var3.a;
                a5j0 a5j0Var = (a5j0) mmr0Var3.b;
                mxv0 mxv0Var3 = (mxv0) qtgVar;
                if (u890.j(gmcVar4.d, mxv0Var3.d.d) && (a5j0Var instanceof x4j0)) {
                    dqu dquVar3 = yak1Var.a;
                    FormatType formatType6 = mxv0Var3.g;
                    LoggingData loggingDataI3 = yhm0.i(((x4j0) a5j0Var).b);
                    if (loggingDataI3 == null || (formatType3 = loggingDataI3.getFormatType()) == null) {
                        formatType3 = FormatType.FORMAT_UNKNOWN;
                    }
                    Set set4 = (Set) ((Map) dquVar3.b).get(formatType6);
                    if (set4 != null) {
                        set = set4;
                    }
                    if (set.contains(formatType3)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
