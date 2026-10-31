package p;

import android.os.Build;
import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.libs.bluetooth.events.proto.BluetoothMtuNegotiationResult;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zjb extends g implements v2j0 {
    public final /* bridge */ /* synthetic */ s2j0 build() {
        return build();
    }

    public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
        return super.buildPartial();
    }

    public final /* bridge */ /* synthetic */ r2j0 clear() {
        return clear();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m861mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(int i) {
        copyOnWrite();
        BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult = (BluetoothMtuNegotiationResult) ((g) this).instance;
        int i2 = BluetoothMtuNegotiationResult.CONNECTION_ID_HASH_FIELD_NUMBER;
        bluetoothMtuNegotiationResult.o(i);
    }

    public final void q(String str) {
        copyOnWrite();
        BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult = (BluetoothMtuNegotiationResult) ((g) this).instance;
        int i = BluetoothMtuNegotiationResult.CONNECTION_ID_HASH_FIELD_NUMBER;
        bluetoothMtuNegotiationResult.p(str);
    }

    public final void r() {
        String str = Build.MANUFACTURER;
        copyOnWrite();
        BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult = (BluetoothMtuNegotiationResult) ((g) this).instance;
        int i = BluetoothMtuNegotiationResult.CONNECTION_ID_HASH_FIELD_NUMBER;
        bluetoothMtuNegotiationResult.q();
    }

    public final void s() {
        String str = Build.MODEL;
        copyOnWrite();
        BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult = (BluetoothMtuNegotiationResult) ((g) this).instance;
        int i = BluetoothMtuNegotiationResult.CONNECTION_ID_HASH_FIELD_NUMBER;
        bluetoothMtuNegotiationResult.r();
    }

    public final void t(int i) {
        copyOnWrite();
        BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult = (BluetoothMtuNegotiationResult) ((g) this).instance;
        int i2 = BluetoothMtuNegotiationResult.CONNECTION_ID_HASH_FIELD_NUMBER;
        bluetoothMtuNegotiationResult.s(i);
    }

    public final void u(int i) {
        copyOnWrite();
        BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult = (BluetoothMtuNegotiationResult) ((g) this).instance;
        int i2 = BluetoothMtuNegotiationResult.CONNECTION_ID_HASH_FIELD_NUMBER;
        bluetoothMtuNegotiationResult.t(i);
    }

    public final void v(int i) {
        copyOnWrite();
        BluetoothMtuNegotiationResult bluetoothMtuNegotiationResult = (BluetoothMtuNegotiationResult) ((g) this).instance;
        int i2 = BluetoothMtuNegotiationResult.CONNECTION_ID_HASH_FIELD_NUMBER;
        bluetoothMtuNegotiationResult.u(i);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m860clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m862mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m859clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m863mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
        return super/*p.r8*/.mergeFrom(phcVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
        return super/*p.r8*/.mergeFrom(lwgVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
        return super/*p.r8*/.mergeFrom(s2j0Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
        return super/*p.r8*/.mergeFrom(bArr);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(bArr, uz00Var);
    }
}
