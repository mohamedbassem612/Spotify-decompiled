package p;

import com.comscore.android.HostApplicationState;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.extendedmetadata.extensions.beatsimpl.proto.BeatsProto;
import com.spotify.extendedmetadata.extensions.concertimpl.proto.Concert;
import com.spotify.extendedmetadata.extensions.merchimpl.proto.MerchItem;
import com.spotify.extendedmetadata.extensions.merchimpl.proto.MerchItems;
import com.spotify.metadata.classic.proto.Metadata;
import com.spotify.recap.RecapExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class via implements ov00 {
    public final /* synthetic */ byte a;

    public static String c(phc phcVar) throws InvalidProtocolBufferException {
        if (phcVar.size() == 16) {
            return g9a.a(phcVar.t());
        }
        throw new InvalidProtocolBufferException("Invalid GID");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final ez00 a(byte[] bArr) throws InvalidProtocolBufferException, NoWhenBranchMatchedException {
        int i;
        phc phcVarN;
        phc phcVarN2;
        int i2;
        switch (this.a) {
            case 0:
                BeatsProto.Beats beatsQ = BeatsProto.Beats.q(bArr);
                int iP = beatsQ.p();
                h290<BeatsProto.Beat> h290VarO = beatsQ.o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (BeatsProto.Beat beat : h290VarO) {
                    arrayList.add(new hia(beat.q(), beat.p(), beat.n(), beat.o(), beat.getValue()));
                }
                return new uia(iP, beatsQ.n(), arrayList);
            case 1:
                Concert concertO = Concert.o(bArr);
                return new j6k(concertO.getUri(), concertO.getTitle(), b2u.m(concertO.n()));
            case 2:
                List<MerchItem> itemsList = MerchItems.o(bArr).getItemsList();
                ArrayList arrayList2 = new ArrayList(q7h.U(itemsList, 10));
                for (MerchItem merchItem : itemsList) {
                    arrayList2.add(new vui0(merchItem.getId(), merchItem.getName(), merchItem.getDescription(), merchItem.getUrl(), merchItem.o(), merchItem.p()));
                }
                return new xti0(arrayList2);
            case 3:
                RecapExtension recapExtensionP = RecapExtension.p(bArr);
                return new zg01(recapExtensionP.o(), TimeUnit.SECONDS.toMillis(recapExtensionP.n().p()));
            default:
                Metadata.Track trackZ = Metadata.Track.z(bArr);
                String strC = c(trackZ.v());
                String name = trackZ.getName();
                String name2 = trackZ.n().getName();
                phc phcVarS = trackZ.n().s();
                String string = phcVarS.equals(phc.b) ? "" : y6b1.a(c(phcVarS)).toString();
                h290<Metadata.ExternalId> h290VarT = trackZ.t();
                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarT, 10));
                for (Metadata.ExternalId externalId : h290VarT) {
                    externalId.getClass();
                    arrayList3.add(new x1g1(externalId.getId(), externalId.n()));
                }
                h290 h290VarO2 = trackZ.o();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarO2, 10));
                Iterator<E> it = h290VarO2.iterator();
                while (it.hasNext()) {
                    phc phcVarV = ((Metadata.Track) it.next()).v();
                    arrayList4.add(new y1g1(phcVarV.equals(phc.b) ? "" : y6b1.m(c(phcVarV)).toString()));
                }
                h290 h290VarQ = trackZ.q();
                ArrayList arrayList5 = new ArrayList(q7h.U(h290VarQ, 10));
                Iterator<E> it2 = h290VarQ.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(new v1g1(((Metadata.Availability) it2.next()).n()));
                }
                List<Metadata.Artist> artistList = trackZ.getArtistList();
                ArrayList arrayList6 = new ArrayList(q7h.U(artistList, 10));
                for (Metadata.Artist artist : artistList) {
                    phc phcVarP = artist.p();
                    arrayList6.add(new s1g1(phcVarP.equals(phc.b) ? "" : y6b1.b(c(phcVarP)).toString(), artist.getName()));
                }
                int discNumber = trackZ.getDiscNumber();
                Integer numValueOf = discNumber > 0 ? Integer.valueOf(discNumber) : null;
                int number = trackZ.getNumber();
                Integer numValueOf2 = number > 0 ? Integer.valueOf(number) : null;
                h290<Metadata.AudioFile> h290VarU = trackZ.u();
                ArrayList arrayList7 = new ArrayList(q7h.U(h290VarU, 10));
                for (Metadata.AudioFile audioFile : h290VarU) {
                    String strZ = zno1.z(audioFile.n().t());
                    switch (a2g1.a[audioFile.o().ordinal()]) {
                        case HostApplicationState.UNKNOWN /* -1 */:
                            i2 = 0;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 0:
                        default:
                            eg.o();
                            return null;
                        case 1:
                            i2 = 1;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 2:
                            i2 = 2;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 3:
                            i2 = 3;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 4:
                            i2 = 4;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 5:
                            i2 = 5;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 6:
                            i2 = 6;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 7:
                            i2 = 7;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 8:
                            i2 = 8;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 9:
                            i2 = 9;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 10:
                            i2 = 10;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 11:
                            i2 = 11;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 12:
                            i2 = 12;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 13:
                            i2 = 13;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 14:
                            i2 = 14;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 15:
                            i2 = 15;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 16:
                            i2 = 16;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 17:
                            i2 = 17;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                        case 18:
                            i2 = 18;
                            continue;
                            arrayList7.add(new u1g1(strZ, i2));
                            break;
                    }
                }
                den denVarT = boo1.t(trackZ.n().o().getImageCount() > 0 ? trackZ.n().o() : null);
                int duration = trackZ.getDuration();
                boolean zS = trackZ.s();
                h290 h290VarR = trackZ.r();
                ArrayList arrayList8 = new ArrayList(q7h.U(h290VarR, 10));
                for (Iterator it3 = h290VarR.iterator(); it3.hasNext(); it3 = it3) {
                    Metadata.ContentRating contentRating = (Metadata.ContentRating) it3.next();
                    arrayList8.add(new w1g1(contentRating.n(), contentRating.o()));
                }
                Metadata.AudioFile audioFile2 = (Metadata.AudioFile) o7h.s0(o7h.o0(trackZ.x()));
                String strZ2 = (audioFile2 == null || (phcVarN2 = audioFile2.n()) == null) ? null : zno1.z(phcVarN2.t());
                if (strZ2 == null) {
                    h290 h290VarO3 = trackZ.o();
                    ArrayList arrayList9 = new ArrayList();
                    Iterator<E> it4 = h290VarO3.iterator();
                    while (it4.hasNext()) {
                        r7h.W(((Metadata.Track) it4.next()).x(), arrayList9);
                    }
                    Metadata.AudioFile audioFile3 = (Metadata.AudioFile) o7h.s0(o7h.o0(arrayList9));
                    strZ2 = (audioFile3 == null || (phcVarN = audioFile3.n()) == null) ? null : zno1.z(phcVarN.t());
                    if (strZ2 == null) {
                        strZ2 = "";
                    }
                }
                String strW = trackZ.w();
                String strY = trackZ.y();
                h290 h290VarP = trackZ.p();
                String str = strZ2;
                ArrayList arrayList10 = new ArrayList(q7h.U(h290VarP, 10));
                Iterator it5 = h290VarP.iterator();
                while (it5.hasNext()) {
                    Metadata.ArtistWithRole artistWithRole = (Metadata.ArtistWithRole) it5.next();
                    Iterator it6 = it5;
                    phc phcVarN3 = artistWithRole.n();
                    den denVar = denVarT;
                    String string2 = phcVarN3.equals(phc.b) ? "" : y6b1.b(c(phcVarN3)).toString();
                    String strO = artistWithRole.o();
                    switch (a2g1.b[artistWithRole.p().ordinal()]) {
                        case HostApplicationState.UNKNOWN /* -1 */:
                        case 1:
                            i = 1;
                            continue;
                            arrayList10.add(new t1g1(i, string2, strO));
                            it5 = it6;
                            arrayList4 = arrayList4;
                            denVarT = denVar;
                            break;
                        case 0:
                        default:
                            eg.o();
                            return null;
                        case 2:
                            i = 2;
                            continue;
                            arrayList10.add(new t1g1(i, string2, strO));
                            it5 = it6;
                            arrayList4 = arrayList4;
                            denVarT = denVar;
                            break;
                        case 3:
                            i = 3;
                            continue;
                            arrayList10.add(new t1g1(i, string2, strO));
                            it5 = it6;
                            arrayList4 = arrayList4;
                            denVarT = denVar;
                            break;
                        case 4:
                            i = 4;
                            continue;
                            arrayList10.add(new t1g1(i, string2, strO));
                            it5 = it6;
                            arrayList4 = arrayList4;
                            denVarT = denVar;
                            break;
                        case 5:
                            i = 5;
                            continue;
                            arrayList10.add(new t1g1(i, string2, strO));
                            it5 = it6;
                            arrayList4 = arrayList4;
                            denVarT = denVar;
                            break;
                        case 6:
                            i = 6;
                            continue;
                            arrayList10.add(new t1g1(i, string2, strO));
                            it5 = it6;
                            arrayList4 = arrayList4;
                            denVarT = denVar;
                            break;
                        case 7:
                            i = 7;
                            continue;
                            arrayList10.add(new t1g1(i, string2, strO));
                            it5 = it6;
                            arrayList4 = arrayList4;
                            denVarT = denVar;
                            break;
                        case 8:
                            i = 8;
                            continue;
                            arrayList10.add(new t1g1(i, string2, strO));
                            it5 = it6;
                            arrayList4 = arrayList4;
                            denVarT = denVar;
                            break;
                    }
                }
                return new z1g1(strC, name, denVarT, duration, str, zS, arrayList6, string, name2, arrayList3, arrayList8, arrayList7, arrayList4, arrayList5, numValueOf, numValueOf2, strW, strY, arrayList10);
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 217;
            case 1:
                return 122;
            case 2:
                return 112;
            case 3:
                return 192;
            default:
                return 10;
        }
    }

    public final Class type() {
        switch (this.a) {
            case 0:
                return uia.class;
            case 1:
                return j6k.class;
            case 2:
                return xti0.class;
            case 3:
                return zg01.class;
            default:
                return z1g1.class;
        }
    }
}
