package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.listplatform.sortingimpl.ListSortingProto$StoredProvidedSortOrder;
import com.spotify.listplatform.sortingimpl.ListSortingProto$UserSortOrders;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w3d0 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m801mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(String str, ListSortingProto$StoredProvidedSortOrder listSortingProto$StoredProvidedSortOrder) {
        str.getClass();
        copyOnWrite();
        ListSortingProto$UserSortOrders listSortingProto$UserSortOrders = (ListSortingProto$UserSortOrders) ((g) this).instance;
        int i = ListSortingProto$UserSortOrders.SORT_ORDERS_FIELD_NUMBER;
        listSortingProto$UserSortOrders.q().put(str, listSortingProto$StoredProvidedSortOrder);
    }

    public final void q(String str, String str2) {
        str.getClass();
        copyOnWrite();
        ListSortingProto$UserSortOrders listSortingProto$UserSortOrders = (ListSortingProto$UserSortOrders) ((g) this).instance;
        int i = ListSortingProto$UserSortOrders.SORT_ORDERS_FIELD_NUMBER;
        listSortingProto$UserSortOrders.r().put(str, str2);
    }

    public final void r(String str) {
        str.getClass();
        copyOnWrite();
        ListSortingProto$UserSortOrders listSortingProto$UserSortOrders = (ListSortingProto$UserSortOrders) ((g) this).instance;
        int i = ListSortingProto$UserSortOrders.SORT_ORDERS_FIELD_NUMBER;
        listSortingProto$UserSortOrders.q().remove(str);
    }

    public final void s(String str) {
        str.getClass();
        copyOnWrite();
        ListSortingProto$UserSortOrders listSortingProto$UserSortOrders = (ListSortingProto$UserSortOrders) ((g) this).instance;
        int i = ListSortingProto$UserSortOrders.SORT_ORDERS_FIELD_NUMBER;
        listSortingProto$UserSortOrders.r().remove(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m800clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m802mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m799clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m803mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
