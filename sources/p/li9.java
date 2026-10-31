package p;

import android.os.Build;
import com.spotify.libs.bluetooth.events.proto.BluetoothMtuNegotiationResult;
import com.spotify.messages.AddToPlaylist;
import com.spotify.yourupdates.domain.YourUpdatesNotificationInteraction;
import java.security.MessageDigest;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class li9 {
    public final t2j0 a;

    public void a(String str, List list, String str2, String str3) {
        rn1 rn1VarO = AddToPlaylist.o();
        rn1VarO.n(list);
        rn1VarO.q(true);
        rn1VarO.t(str2);
        rn1VarO.s(str3);
        if (str.length() != 0) {
            rn1VarO.r(str);
        }
        this.a.a(rn1VarO.build());
    }

    public void b(int i, int i2, int i3, String str) {
        zjb zjbVarN = BluetoothMtuNegotiationResult.n();
        zjbVarN.q(o7h.y0(f46.J0(MessageDigest.getInstance("SHA-256").digest(str.getBytes(nne.a)), 8), "", (String) null, (String) null, zv8.Y, 30));
        zjbVarN.v(i);
        zjbVarN.u(i2);
        zjbVarN.t(i3);
        zjbVarN.n(Build.VERSION.SDK_INT);
        String str2 = Build.MANUFACTURER;
        zjbVarN.r();
        String str3 = Build.MODEL;
        zjbVarN.s();
        BluetoothMtuNegotiationResult bluetoothMtuNegotiationResultBuild = zjbVarN.build();
        bluetoothMtuNegotiationResultBuild.getClass();
        this.a.a(bluetoothMtuNegotiationResultBuild);
    }

    public void c(String str, String str2, String str3, String str4, String str5, String str6) {
        k2n1 k2n1VarN = YourUpdatesNotificationInteraction.n();
        k2n1VarN.s(str);
        k2n1VarN.q(str2);
        k2n1VarN.n(str3);
        k2n1VarN.u(str4);
        k2n1VarN.r(str5);
        k2n1VarN.t(str6);
        this.a.a(k2n1VarN.build());
    }
}
