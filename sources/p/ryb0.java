package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.leavebehindads.events.proto.LeavebehindAdEvent;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ryb0 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m653mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(String str) {
        copyOnWrite();
        LeavebehindAdEvent leavebehindAdEvent = (LeavebehindAdEvent) ((g) this).instance;
        int i = LeavebehindAdEvent.LEAVEBEHIND_LINEITEM_ID_FIELD_NUMBER;
        leavebehindAdEvent.o(str);
    }

    public final void q(String str) {
        copyOnWrite();
        LeavebehindAdEvent leavebehindAdEvent = (LeavebehindAdEvent) ((g) this).instance;
        int i = LeavebehindAdEvent.LEAVEBEHIND_LINEITEM_ID_FIELD_NUMBER;
        leavebehindAdEvent.p(str);
    }

    public final void r(String str) {
        copyOnWrite();
        LeavebehindAdEvent leavebehindAdEvent = (LeavebehindAdEvent) ((g) this).instance;
        int i = LeavebehindAdEvent.LEAVEBEHIND_LINEITEM_ID_FIELD_NUMBER;
        leavebehindAdEvent.q(str);
    }

    public final void s(String str) {
        copyOnWrite();
        LeavebehindAdEvent leavebehindAdEvent = (LeavebehindAdEvent) ((g) this).instance;
        int i = LeavebehindAdEvent.LEAVEBEHIND_LINEITEM_ID_FIELD_NUMBER;
        leavebehindAdEvent.r(str);
    }

    public final void t(String str) {
        copyOnWrite();
        LeavebehindAdEvent leavebehindAdEvent = (LeavebehindAdEvent) ((g) this).instance;
        int i = LeavebehindAdEvent.LEAVEBEHIND_LINEITEM_ID_FIELD_NUMBER;
        leavebehindAdEvent.s(str);
    }

    public final void u(int i) {
        copyOnWrite();
        LeavebehindAdEvent leavebehindAdEvent = (LeavebehindAdEvent) ((g) this).instance;
        int i2 = LeavebehindAdEvent.LEAVEBEHIND_LINEITEM_ID_FIELD_NUMBER;
        leavebehindAdEvent.t(i);
    }

    public final void v(String str) {
        copyOnWrite();
        LeavebehindAdEvent leavebehindAdEvent = (LeavebehindAdEvent) ((g) this).instance;
        int i = LeavebehindAdEvent.LEAVEBEHIND_LINEITEM_ID_FIELD_NUMBER;
        leavebehindAdEvent.u(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m652clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m654mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m651clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m655mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
